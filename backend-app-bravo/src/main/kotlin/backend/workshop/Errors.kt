package backend.workshop

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.LocalDateTime

data class ApiSubError(
    val code: String? = "NO-CODE",
    val message: String? = "NO MESSAGE",
)

data class ApiError(
    val localDateTime: String = LocalDateTime.now().toString(),
    val status: HttpStatus,
    val message: String? = null,
    val debugMessage: String? = null,
    var apiSubErrors: MutableList<ApiSubError> = mutableListOf(),
) {
    fun addSubError(apiError: ApiSubError) {
        apiSubErrors.add(apiError)
    }
}

@ControllerAdvice
class RestExceptionHandler : ResponseEntityExceptionHandler() {

    fun buildResponseEntity(apiError: ApiError): ResponseEntity<Any>? {
        return ResponseEntity(apiError, apiError.status)
    }

    @ExceptionHandler(NoSuchElementException::class)
    fun elementNotFound(
        ex: java.lang.Exception,
        request: WebRequest,
    ): ResponseEntity<Any>? {
        val apiError = ApiError(
            message = "No se encontró el elemento solicitado.",
            debugMessage = ex.message,
            status = HttpStatus.NOT_FOUND
        )

        apiError.addSubError(ApiSubError("ELEMENT_NOT_FOUND", "No se encontró el elemento solicitado."))

        return buildResponseEntity(apiError)
    }

    @ExceptionHandler(Exception::class)
    fun handleAll(
        ex: java.lang.Exception,
        request: WebRequest,
    ): ResponseEntity<Any>? {
        val apiError = ApiError(
            message = "Ocurrió un error desconocido.",
            debugMessage = ex.message,
            status = HttpStatus.NOT_FOUND
        )

        apiError.addSubError(ApiSubError("INTERNAL_ERROR", "Ocurrió un error desconocido en el sistema."))

        return buildResponseEntity(apiError)

    }

}
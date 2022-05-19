package backend.workshop

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("\${url.vehicles}")
class VehicleController(private val vehicleService: VehicleService) {

    @GetMapping
    @ResponseBody
    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun find(@RequestParam(required = false) param: Map<String, String>) =
        when {
            param.containsKey("id") -> {
                param["id"]?.let { vehicleService.findById(it.toLong()) }
            }
            param.containsKey("plate") -> {
                param["plate"]?.let { vehicleService.findByPlateNumber(it) }
            }
            param.containsKey("vin") -> {
                param["vin"]?.let { vehicleService.findByVinNumber(it) }
            }
            else -> {
                vehicleService.findAll()
            }
        }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody vehicleInput: VehicleInput): VehicleResult? {
        return vehicleService.create(vehicleInput)
    }
}

@RestController
@RequestMapping("\${url.services}")
class ServiceController(private val serviceService: ServiceService) {

    @GetMapping
    @ResponseBody
    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun find(@RequestParam(required = false) param: Map<String, String>) =
        when {
            param.containsKey("id") -> {
                param["id"]?.let { serviceService.findById(it.toLong()) }
            }
            param.containsKey("state") -> {
                param["state"]?.let { serviceService.findByState(it) }
            }
            else -> {
                serviceService.findAll()
            }
        }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody serviceInput: ServiceInput): ServiceResult? {
        return serviceService.create(serviceInput)
    }
}

@RestController
@RequestMapping("\${url.reports}")
class ReportController(private val reportService: ReportService) {

    @GetMapping
    @ResponseBody
    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun find(@RequestParam(required = false) param: Map<String, String>) =
        when {
            param.containsKey("id") -> {
                param["id"]?.let { reportService.findById(it.toLong()) }
            }
            param.containsKey("client_id") -> {
                param["client_id"]?.let { reportService.findByClientId(it.toLong()) }
            }
            param.containsKey("plate") -> {
                param["plate"]?.let { reportService.findByVehicleNumberPlate(it) }
            }
            else -> {
                reportService.findAll()
            }
        }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody reportInput: ReportInput): ReportResult? {
        return reportService.create(reportInput)
    }

}
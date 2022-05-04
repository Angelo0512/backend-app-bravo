package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017\u00a8\u0006\u000e"}, d2 = {"Lbackend/workshop/RestExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "buildResponseEntity", "Lorg/springframework/http/ResponseEntity;", "", "apiError", "Lbackend/workshop/ApiError;", "elementNotFound", "ex", "Ljava/lang/Exception;", "request", "Lorg/springframework/web/context/request/WebRequest;", "handleAll", "backend-app-bravo"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class RestExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    
    public RestExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.springframework.http.ResponseEntity<java.lang.Object> buildResponseEntity(@org.jetbrains.annotations.NotNull()
    backend.workshop.ApiError apiError) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.util.NoSuchElementException.class})
    public org.springframework.http.ResponseEntity<java.lang.Object> elementNotFound(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.Exception.class})
    public org.springframework.http.ResponseEntity<java.lang.Object> handleAll(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
}
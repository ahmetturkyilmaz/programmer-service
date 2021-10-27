package com.fitness.programmer.exception;

import com.fitness.programmer.controller.BaseController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;
import java.util.Date;

@ControllerAdvice(basePackageClasses = BaseController.class)
public class BaseControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotAuthorizedException.class)
    public final ResponseEntity<RequestExceptionResponse> handleUserNotFoundException(UserNotAuthorizedException ex, Exception e, WebRequest request) {
        HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;

        logger.error(HttpStatus.UNAUTHORIZED.getReasonPhrase(),e);

        RequestExceptionResponse exceptionResponse = new RequestExceptionResponse(new Date().getTime(), ex.getLocalizedMessage(),request.getDescription(false),httpStatus.value(),httpStatus);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.put("exception-type", Collections.singletonList("Unauthorized"));

        return new ResponseEntity<>(exceptionResponse,headers,httpStatus);
    }

}

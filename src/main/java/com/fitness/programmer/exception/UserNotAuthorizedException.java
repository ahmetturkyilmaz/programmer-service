package com.fitness.programmer.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

public class UserNotAuthorizedException extends RequestException {
    private String message;

    public UserNotAuthorizedException(String message) {
        this.message = message;
    }

    public UserNotAuthorizedException(String message, Integer exceptionCode) {
        super(message, exceptionCode);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

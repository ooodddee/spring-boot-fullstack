package com.amigoscode.exception;

public class RequestValidationException extends ResourceNotFoundException{
    public RequestValidationException(String message) {
        super(message);
    }
}

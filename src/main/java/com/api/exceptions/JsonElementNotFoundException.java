package com.api.exceptions;

public class JsonElementNotFoundException extends RuntimeException{
    public JsonElementNotFoundException(String message) {
        super(message);
    }
}

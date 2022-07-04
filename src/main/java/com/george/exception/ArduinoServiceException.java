package com.george.exception;

public class ArduinoServiceException extends Exception {

    public ArduinoServiceException(String message) {
        super(message);
    }

    public ArduinoServiceException(Throwable throwable) {
        super(throwable);
    }

}

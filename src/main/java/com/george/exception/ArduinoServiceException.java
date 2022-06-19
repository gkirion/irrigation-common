package com.george.exception;

import com.george.service.ArduinoService;

public class ArduinoServiceException extends Exception {

    public ArduinoServiceException(String message) {
        super(message);
    }

    public ArduinoServiceException(Throwable throwable) {
        super(throwable);
    }

}

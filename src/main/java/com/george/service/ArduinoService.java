package com.george.service;

import com.george.exception.ArduinoServiceException;
import com.george.model.IrrigationStatus;

import java.io.IOException;

public interface ArduinoService {

    IrrigationStatus getIrrigationStatus() throws ArduinoServiceException;

    IrrigationStatus setIrrigationStatus(IrrigationStatus irrigationStatus) throws ArduinoServiceException;

}

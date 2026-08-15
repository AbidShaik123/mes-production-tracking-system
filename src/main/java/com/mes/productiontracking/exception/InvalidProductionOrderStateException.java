package com.mes.productiontracking.exception;

public class InvalidProductionOrderStateException extends RuntimeException {

    public InvalidProductionOrderStateException(String message) {
        super(message);
    }
}
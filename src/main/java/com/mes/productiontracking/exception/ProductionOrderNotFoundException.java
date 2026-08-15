package com.mes.productiontracking.exception;

public class ProductionOrderNotFoundException extends RuntimeException {

    public ProductionOrderNotFoundException(String message) {
        super(message);
    }
}
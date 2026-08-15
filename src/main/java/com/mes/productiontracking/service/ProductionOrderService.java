package com.mes.productiontracking.service;

import com.mes.productiontracking.entity.ProductionOrder;
import com.mes.productiontracking.repository.ProductionOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionOrderService {

    private final ProductionOrderRepository repository;

    public ProductionOrderService(ProductionOrderRepository repository) {
        this.repository = repository;
    }

    public ProductionOrder createOrder(ProductionOrder order) {
        return repository.save(order);
    }

    public List<ProductionOrder> getAllOrders() {
        return repository.findAll();
    }
}
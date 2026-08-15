package com.mes.productiontracking.service;

import com.mes.productiontracking.exception.InvalidProductionOrderStateException;
import com.mes.productiontracking.exception.ProductionOrderNotFoundException;
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
    public ProductionOrder startProduction(Long id) {

        ProductionOrder order = repository.findById(id)
                .orElseThrow(() -> new ProductionOrderNotFoundException(
                        "Production order not found with id: " + id ));

        if (!"PLANNED".equals(order.getStatus())) {
            throw new InvalidProductionOrderStateException(
                    "Only PLANNED orders can be started. Current status: " + order.getStatus()
            );
        }

        order.setStatus("IN_PROGRESS");
        order.setStartTime(java.time.LocalDateTime.now());

        return repository.save(order);
    }
    public ProductionOrder completeProduction(Long id) {

        ProductionOrder order = repository.findById(id)
                .orElseThrow(() -> new ProductionOrderNotFoundException(
                        "Production order not found with id: " + id ));

        if (!"IN_PROGRESS".equals(order.getStatus())) {
            throw new InvalidProductionOrderStateException(
                    "Only IN_PROGRESS orders can be completed. Current status: " + order.getStatus()
            );
        }

        order.setStatus("COMPLETED");
        order.setCompletionTime(java.time.LocalDateTime.now());

        return repository.save(order);
    }
}
package com.mes.productiontracking.controller;


import com.mes.productiontracking.entity.ProductionOrder;
import com.mes.productiontracking.service.ProductionOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/production-orders")
public class ProductionOrderController {

    private final ProductionOrderService service;

    public ProductionOrderController(ProductionOrderService service) {
        this.service = service;
    }

    @PostMapping
    public ProductionOrder createOrder(@RequestBody ProductionOrder order) {
        return service.createOrder(order);
    }

    @GetMapping
    public List<ProductionOrder> getAllOrders() {
        return service.getAllOrders();
    }

    @PutMapping("/{id}/start")
    public ProductionOrder startProduction(@PathVariable Long id) {
        return service.startProduction(id);
    }

    @PutMapping("/{id}/complete")
    public ProductionOrder completeProduction(@PathVariable Long id) {
        return service.completeProduction(id);
    }
}
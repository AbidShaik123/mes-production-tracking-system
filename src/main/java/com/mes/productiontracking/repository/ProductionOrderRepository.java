package com.mes.productiontracking.repository;

import com.mes.productiontracking.entity.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionOrderRepository
        extends JpaRepository<ProductionOrder, Long> {

}
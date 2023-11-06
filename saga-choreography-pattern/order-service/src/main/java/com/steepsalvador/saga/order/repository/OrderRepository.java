package com.steepsalvador.saga.order.repository;

import com.steepsalvador.saga.order.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<PurchaseOrder,Integer> {
}

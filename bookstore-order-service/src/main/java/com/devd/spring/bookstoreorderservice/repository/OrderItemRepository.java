package com.devd.spring.bookstoreorderservice.repository;

import com.devd.spring.bookstoreorderservice.repository.dao.OrderItem;
import org.springframework.data.repository.CrudRepository;


public interface OrderItemRepository extends CrudRepository<OrderItem, String> {
}

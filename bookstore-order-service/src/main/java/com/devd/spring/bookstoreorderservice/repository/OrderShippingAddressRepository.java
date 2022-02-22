package com.devd.spring.bookstoreorderservice.repository;

import com.devd.spring.bookstoreorderservice.repository.dao.OrderShippingAddress;
import org.springframework.data.repository.CrudRepository;


public interface OrderShippingAddressRepository extends CrudRepository<OrderShippingAddress, String> {
    OrderShippingAddress findByOrderId(String orderId);
}

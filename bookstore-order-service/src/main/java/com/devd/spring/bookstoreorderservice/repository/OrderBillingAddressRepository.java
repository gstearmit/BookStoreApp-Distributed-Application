package com.devd.spring.bookstoreorderservice.repository;

import com.devd.spring.bookstoreorderservice.repository.dao.OrderBillingAddress;
import org.springframework.data.repository.CrudRepository;


public interface OrderBillingAddressRepository extends CrudRepository<OrderBillingAddress, String> {
    OrderBillingAddress findByOrderId(String orderId);
}

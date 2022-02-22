package com.devd.spring.bookstorepaymentservice.repository;

import com.devd.spring.bookstorepaymentservice.repository.dao.UserPaymentCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPaymentCustomerRepository extends JpaRepository<UserPaymentCustomer, String> {

    UserPaymentCustomer findByUserId(String userId);
}

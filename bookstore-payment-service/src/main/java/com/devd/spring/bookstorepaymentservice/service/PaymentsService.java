package com.devd.spring.bookstorepaymentservice.service;

import com.devd.spring.bookstorepaymentservice.web.CreatePaymentRequest;
import com.devd.spring.bookstorepaymentservice.web.CreatePaymentResponse;


public interface PaymentsService {
    CreatePaymentResponse createPaymentRequest(CreatePaymentRequest createPaymentRequest);
}

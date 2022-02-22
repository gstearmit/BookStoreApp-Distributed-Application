package com.devd.spring.bookstorepaymentservice.service;

import com.devd.spring.bookstorepaymentservice.web.CreatePaymentMethodRequest;
import com.devd.spring.bookstorepaymentservice.web.GetPaymentMethodResponse;

import java.util.List;


public interface PaymentMethodService {
    void createPaymentMethod(CreatePaymentMethodRequest createPaymentMethodRequest);

    List<GetPaymentMethodResponse> getAllMyPaymentMethods();

    GetPaymentMethodResponse getMyPaymentMethodById(String paymentMethodId);
}

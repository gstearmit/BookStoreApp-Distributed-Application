package com.devd.spring.bookstorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {
    private int amount;
    private String currency;
    private String paymentMethodId;

}

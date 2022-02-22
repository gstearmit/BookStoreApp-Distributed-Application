package com.devd.spring.bookstoreorderservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String paymentMethodId;
    private String cardBrand;
    private String last4Digits;
}

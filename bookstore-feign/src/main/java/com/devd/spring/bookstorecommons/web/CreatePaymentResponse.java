package com.devd.spring.bookstorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePaymentResponse {
    private String paymentId;
    private LocalDateTime paymentDate;
    private boolean captured;
    private String receipt_url;
}

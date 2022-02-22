package com.devd.spring.bookstorecommons.feign;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("bookstore-order-service")
public interface OrderFeignClient {


}

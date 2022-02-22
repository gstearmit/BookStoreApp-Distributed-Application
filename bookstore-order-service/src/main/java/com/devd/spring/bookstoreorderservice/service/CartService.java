package com.devd.spring.bookstoreorderservice.service;

import com.devd.spring.bookstoreorderservice.repository.dao.Cart;


public interface CartService {

    Cart getCart();
    
    Cart getCartByCartId(String cartId);

    String createCart();

    Cart getCartByUserName(String userName);

}

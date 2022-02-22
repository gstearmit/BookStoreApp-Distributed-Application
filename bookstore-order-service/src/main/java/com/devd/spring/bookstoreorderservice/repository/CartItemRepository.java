package com.devd.spring.bookstoreorderservice.repository;

import com.devd.spring.bookstoreorderservice.repository.dao.CartItem;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;



public interface CartItemRepository extends CrudRepository<CartItem, String> {

    @Modifying
    @Transactional
    void deleteByCartItemId(String cartItemId);

    Optional<CartItem> findByCartItemId(String cartItemId);
}

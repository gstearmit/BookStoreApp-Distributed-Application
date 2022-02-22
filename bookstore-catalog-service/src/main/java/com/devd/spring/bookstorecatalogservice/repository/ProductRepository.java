package com.devd.spring.bookstorecatalogservice.repository;

import com.devd.spring.bookstorecatalogservice.repository.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}

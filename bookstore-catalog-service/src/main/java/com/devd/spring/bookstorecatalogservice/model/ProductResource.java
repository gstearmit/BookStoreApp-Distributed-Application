package com.devd.spring.bookstorecatalogservice.model;

import com.devd.spring.bookstorecatalogservice.repository.dao.Product;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;


@Data
public class ProductResource extends EntityModel<Product> {
    
    private Pageable pageable;
    
    public ProductResource(Product content, Link... links) {
        EntityModel.of(content, links);
    }
}

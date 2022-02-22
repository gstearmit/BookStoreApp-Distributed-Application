package com.devd.spring.bookstorecatalogservice.web;

import com.devd.spring.bookstorecatalogservice.repository.dao.ProductCategory;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;


@Data
public class ProductCategoriesPagedResponse {
    
    Page<ProductCategory> page;
    Map<String, String> _links = new HashMap<>();
    
}

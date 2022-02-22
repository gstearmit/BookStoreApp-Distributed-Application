package com.devd.spring.bookstorecatalogservice.service;

import com.devd.spring.bookstorecatalogservice.repository.dao.Review;
import com.devd.spring.bookstorecatalogservice.web.CreateOrUpdateReviewRequest;

import java.util.List;


public interface ReviewService {

    void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest);

    List<Review> getReviewsForProduct(String productId);

}

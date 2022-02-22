package com.devd.spring.bookstoreaccountservice.repository;

import com.devd.spring.bookstoreaccountservice.repository.dao.OAuthClient;
import org.springframework.data.repository.CrudRepository;


public interface OAuthClientRepository extends CrudRepository<OAuthClient, Long> {

}

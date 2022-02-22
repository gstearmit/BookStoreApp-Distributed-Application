package com.devd.spring.bookstoreaccountservice.repository;

import com.devd.spring.bookstoreaccountservice.repository.dao.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {

  Optional<Role> findByRoleName(String name);

  Boolean existsByRoleName(String roleName);

  @Override
  List<Role> findAll();
}

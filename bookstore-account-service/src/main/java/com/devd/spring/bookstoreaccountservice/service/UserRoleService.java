package com.devd.spring.bookstoreaccountservice.service;

import com.devd.spring.bookstoreaccountservice.web.MapRoleToUsersRequest;
import com.devd.spring.bookstoreaccountservice.web.MapUserToRolesRequest;


public interface UserRoleService {

  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}

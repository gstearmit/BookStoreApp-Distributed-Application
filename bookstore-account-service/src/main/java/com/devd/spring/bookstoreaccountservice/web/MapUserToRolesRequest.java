package com.devd.spring.bookstoreaccountservice.web;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapUserToRolesRequest {

  private List<String> roleNames;
}

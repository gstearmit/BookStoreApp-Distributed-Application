package com.devd.spring.bookstoreapigatewayservice.filters;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;


public class PostFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return FilterConstants.POST_TYPE;
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    System.out.println("Inside Response Filter");
    return null;
  }
}

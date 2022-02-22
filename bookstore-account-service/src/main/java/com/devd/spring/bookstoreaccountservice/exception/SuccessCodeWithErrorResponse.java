package com.devd.spring.bookstoreaccountservice.exception;

import com.devd.spring.bookstorecommons.exception.ErrorResponse;
import lombok.Getter;


public class SuccessCodeWithErrorResponse extends RuntimeException {

  @Getter
  private ErrorResponse errorResponse;

  @Getter
  private String id;

  public SuccessCodeWithErrorResponse(String id, ErrorResponse errorResponse) {
    this.id = id;
    this.errorResponse = errorResponse;
  }

  public SuccessCodeWithErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

}

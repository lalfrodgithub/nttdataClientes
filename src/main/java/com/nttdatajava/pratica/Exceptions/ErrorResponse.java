package com.nttdatajava.pratica.Exceptions;



import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ErrorResponse {

  public ErrorResponse(String message, String coderror, List<String> details) {
    super();
    this.message = message;
    this.coderror = coderror;
    this.details = details;
  }

  private String message;
  private String coderror;

  private List<String> details;
}


package com.rjpard.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  @Value("${message}") String message;

  @GetMapping("/message")
  public String showMessage() {
    return "The message is: " + this.message;
  }
}
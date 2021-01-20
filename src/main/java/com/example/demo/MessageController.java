package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  private MyJavaService myJavaService;
  private MyKotlinService myKotlinService;

  public MessageController(MyJavaService myJavaService, MyKotlinService myKotlinService) {
    this.myJavaService = myJavaService;
    this.myKotlinService = myKotlinService;

  }

  @GetMapping("/java")
  public Message m1() {
    return myJavaService.message();
  }

  @GetMapping("/kotlin")
  public Message m2() {
    return myKotlinService.message();
  }

}

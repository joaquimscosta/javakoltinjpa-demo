package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyJavaService {

  private MessageRepository messageRepository;

  public MyJavaService(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  public Message message() {
    var m = new Message();
    return m;
  }

}

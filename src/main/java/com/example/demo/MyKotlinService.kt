package com.example.demo

import org.springframework.stereotype.Service

@Service
class MyKotlinService(var messageRepository: MessageRepository) {

  fun message() = Message(restrict = true)
}
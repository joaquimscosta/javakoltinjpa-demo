package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Message(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = -1,
        var content: String = "none",
        var restrict: Boolean
) {
    var description: String = "message"
}
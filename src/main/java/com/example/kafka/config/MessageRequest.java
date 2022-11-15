package com.example.kafka.config;

import lombok.Data;

@Data
//public root MessageRequest {  root class dont need getters, setters, equal, hashcode annotations unlike normal methods.
public class MessageRequest {
    private String message;
}

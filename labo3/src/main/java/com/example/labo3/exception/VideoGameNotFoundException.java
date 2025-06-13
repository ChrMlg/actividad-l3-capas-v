package com.example.labo3.exception;

public class VideoGameNotFoundException extends RuntimeException {
  public VideoGameNotFoundException(String message) {
    super(message);
  }
}

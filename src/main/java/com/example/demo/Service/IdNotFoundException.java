package com.example.demo.Service;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
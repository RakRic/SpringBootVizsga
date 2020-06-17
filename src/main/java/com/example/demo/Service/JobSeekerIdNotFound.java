package com.example.demo.Service;

public class JobSeekerIdNotFound extends RuntimeException{
    public JobSeekerIdNotFound(String errorMessage){
        super(errorMessage);
    }
}
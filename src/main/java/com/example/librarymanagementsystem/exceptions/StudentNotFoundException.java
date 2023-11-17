package com.example.librarymanagementsystem.exceptions;

public class StudentNotFoundException extends Exception{//this is the process of making custom exception
    public StudentNotFoundException(String message){
        super(message);
    }
}

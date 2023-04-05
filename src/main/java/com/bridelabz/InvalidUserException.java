package com.bridelabz;

public class InvalidUserException extends Exception{
    public InvalidUserException(String detail) {
        super(detail);
    }
}

package com.exception.exception;

import com.exception.error.MyDIYException;

public class MyException extends RuntimeException{
    public MyException(String s){
        super(s);
    }
}

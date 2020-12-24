package com.dummytesting;

public class MoodAnalyserException extends Exception{
    enum ExceptionType{
        NULL_TYPE,EMPTY_TYPE;
    }
    ExceptionType type;


    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}

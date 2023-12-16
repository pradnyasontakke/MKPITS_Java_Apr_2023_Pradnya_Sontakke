package com.example.RestRepositoryLevel3.ExceptionStudent;

public class RecordNotFound  extends  RuntimeException{
    public RecordNotFound(String message) {
        super(message);
    }
}

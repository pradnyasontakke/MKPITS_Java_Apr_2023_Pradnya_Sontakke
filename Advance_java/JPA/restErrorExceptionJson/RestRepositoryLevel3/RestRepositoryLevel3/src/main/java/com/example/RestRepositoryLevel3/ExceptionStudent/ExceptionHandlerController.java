package com.example.RestRepositoryLevel3.ExceptionStudent;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler
    public ResponseEntity<ErrorPage> handleException(RecordNotFound recordNotFound) {
        ErrorPage errorPage=new ErrorPage();
        errorPage.setStatus_code(HttpStatus.NOT_FOUND.value());
        errorPage.setMessage("Record not found");
        errorPage.setTime(System.currentTimeMillis());
        return new ResponseEntity<>(errorPage,HttpStatus.NOT_FOUND);

    }
}



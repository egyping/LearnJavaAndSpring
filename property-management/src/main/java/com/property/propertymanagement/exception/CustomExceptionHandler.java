package com.property.propertymanagement.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

// This is the centeral calss will handle the exceptions
//@ControllerAdvice tells spring that this is the centeral class for handling exception

@ControllerAdvice
public class CustomExceptionHandler {

    // Function to handle the business exceptions
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException bex){
        System.out.println("Business exception printed");
        // return to the front end message to show
        // the exact message coming from the error model
        return new ResponseEntity<List<ErrorModel>>(bex.getErrors(),HttpStatus.BAD_REQUEST)
    }
}

package com.property.propertymanagement.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

// This is the centeral calss will handle the exceptions
//@ControllerAdvice tells spring that this is the centeral class for handling exception

@ControllerAdvice
public class CustomExceptionHandler {

    // Function to handle the business exceptions any error coming from the service business
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException bex){
        System.out.println("Business exception printed");
        // return to the front end message to show
        // the exact message coming from the error model
        // List<ErrorModel is the type of data we are responding with
        return new ResponseEntity<List<ErrorModel>>(bex.getErrors(),HttpStatus.BAD_REQUEST);
    }

    // method to handle the default messages coming from the validation module
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorModel>> handleFieldValidation(MethodArgumentNotValidException manv){
        // so basically we want to convert the errors which coming from the validation module to
        // error model type field so errorModelList is empty list from error ready to take new enteries
        // fieldErrorList is holding the errors
        // for loop to convert
        List<ErrorModel> errorModelList = new ArrayList<>();
        ErrorModel errorModel = null;
        // FieldError os coming frm spring its list coming from the validation module
        List<FieldError> fieldErrorList = manv.getBindingResult().getFieldErrors();
        // loop in the fieldErrorList each fe hold code and message enough to creat error model object and at the end
        // add the object to the list
        for(FieldError fe: fieldErrorList){
//            logger.debug("Inside field validation: {} - {}", fe.getField(), fe.getDefaultMessage());
//            logger.info("Inside field validation: {} - {}", fe.getField(), fe.getDefaultMessage());
            errorModel = new ErrorModel();
            errorModel.setCode(fe.getField());
            errorModel.setMessage(fe.getDefaultMessage());
            errorModelList.add(errorModel);
        }
        // return the list
        return new ResponseEntity<List<ErrorModel>>(errorModelList, HttpStatus.BAD_REQUEST);

    }
}

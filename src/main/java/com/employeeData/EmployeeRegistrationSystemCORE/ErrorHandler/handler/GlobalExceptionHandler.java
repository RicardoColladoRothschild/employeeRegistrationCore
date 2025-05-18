package com.employeeData.EmployeeRegistrationSystemCORE.ErrorHandler.handler;


import com.employeeData.EmployeeRegistrationSystemCORE.ErrorHandler.exceptions.EmployeeAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmployeeAlreadyExistException.class)
    public ResponseEntity<String> handleEmployeeAlreadyExists(EmployeeAlreadyExistException ex) {
        System.out.println("[X] - The user you are trying to create, was confirmed that already exist");
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}

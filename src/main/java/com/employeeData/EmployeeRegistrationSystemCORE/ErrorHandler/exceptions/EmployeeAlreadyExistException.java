package com.employeeData.EmployeeRegistrationSystemCORE.ErrorHandler.exceptions;

public class EmployeeAlreadyExistException extends RuntimeException{
    public EmployeeAlreadyExistException(String message){
        super(message);
    }
}

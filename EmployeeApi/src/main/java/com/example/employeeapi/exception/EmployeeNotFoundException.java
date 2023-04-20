package com.example.employeeapi.exception;


import com.example.employeeapi.entity.StatusResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EmployeeNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                     boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public EmployeeNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public EmployeeNotFoundException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public EmployeeNotFoundException(StatusResponse status, HttpStatus statusCode) {

    }
}


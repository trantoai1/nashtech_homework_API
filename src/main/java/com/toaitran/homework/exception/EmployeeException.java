package com.toaitran.homework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.management.RuntimeErrorException;
@ResponseStatus(HttpStatus.NOT_FOUND)

public class EmployeeException extends RuntimeException{
    public EmployeeException(Long a) {
        super("Employee id "+ a+ " not food!");
    }

}

package com.tcs.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = IdNotFoundException.class)
	public   ResponseEntity<ErrorInfo> handleExceptionForId(IdNotFoundException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMessage());
		errorInfo.setHttpStatus(HttpStatus.NOT_FOUND);
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InValidAgeException.class)
	public String handleExceptionForAge(InValidAgeException exception)
	{
		return exception.getMessage();
	}
}

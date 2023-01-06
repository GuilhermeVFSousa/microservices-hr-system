package com.gvfs.payrollapi.resources.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(com.gvfs.payrollapi.services.exceptions.ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(com.gvfs.payrollapi.services.exceptions.ObjectNotFoundException ex, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				new StandardError(
						LocalDateTime.now(),
						ex.getMessage(),
						HttpStatus.NOT_FOUND.value(),
						request.getRequestURI())
				);
	}

}

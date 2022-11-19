package com.backend.exceptions;

import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.backend.model.ApiErrors;


/**
 * @author AvinashSankineni
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	/**
	 *
	 */
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		String error="Table not found";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		headers.add("info", message);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	/**
	 *
	 */
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		String error="media type not supported";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		headers.add("info", message);
		return ResponseEntity.status(status).body(errors);
	}

	/**
	 *
	 */
	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		String error="path variable missing";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		headers.add("info", message);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	/**
	 *
	 */
	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		String error="Missing Servlet Request Parameter";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		headers.add("info", message);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}
	/**
	 *
	 */
	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		String error="Type mitch match ";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		headers.add("info", message);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}
	
	/**
	 * @param ex for printing the message
	 * @return the message
	 */
	@ExceptionHandler(TableNotFoundException.class)
	public ResponseEntity<Object> handleTableNotFound(TableNotFoundException ex){
		String message=ex.getMessage();
		String error="Table not found please check once";
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), message,HttpStatus.CONFLICT, HttpStatus.CONFLICT.value(), error);
		HttpHeaders headers=new HttpHeaders();
		headers.add("info", message);
		return ResponseEntity.status(HttpStatus.CONFLICT).headers(headers).body(errors);
	}
	
	/**
	 * @param ex for printing the message
	 * @return the message
	 */
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<Object> handleSQLException(SQLException ex){
	    String message=ex.getMessage();
	    String error="Your have entered wrong one please check once";
	    ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,HttpStatus.CONFLICT,HttpStatus.CONFLICT.value(),error);
	    HttpHeaders headers=new HttpHeaders();
	    headers.add("info", message);
	    return ResponseEntity.status(HttpStatus.CONFLICT).headers(headers).body(errors);
	}
}

package com.example.springpractice.handler;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

	private final Logger logger = LoggerFactory.getLogger(ApiControllerAdvice.class);

	@ExceptionHandler(NotFoundException.class)
	ResponseEntity<Map<String, String>> notFound(final NotFoundException e) {
		final Map<String, String> response = new HashMap<>();

		response.put("error", "not found");
		response.put("message", e.getMessage());

		logger.error("error:'{}'", e);

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
}

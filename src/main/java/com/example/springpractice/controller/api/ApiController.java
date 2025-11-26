package com.example.springpractice.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	@GetMapping
	public ResponseEntity<Map<String, String>> index(@RequestParam(required = false) final Integer page)
			throws NotFoundException {
		final Map<String, String> data = new HashMap<>();

		data.put("data", "Hello");

		if (page == null) {
			throw new NotFoundException("リソースが見つかりません。");
		}

		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}

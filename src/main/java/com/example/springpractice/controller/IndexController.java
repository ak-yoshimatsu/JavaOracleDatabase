package com.example.springpractice.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springpractice.dto.PhotoDto;
import com.example.springpractice.entity.PhotoEntity;
import com.example.springpractice.mapper.PhotoMapper;
import com.example.springpractice.service.RestTemplateService;

@Controller
public class IndexController {

	private final RestTemplateService service;
	private final PhotoMapper mapper;

	public IndexController(final RestTemplateService service, final PhotoMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@GetMapping("/")
	public String index() {

		final ResponseEntity<List<PhotoDto>> response = this.service.get();

		//結果の取得
		final HttpStatusCode status = response.getStatusCode();
		final List<PhotoDto> body = response.getBody();

		System.out.println("status: " + status);
		System.out.println("body: " + body);

		final List<PhotoEntity> entities = mapper.toEntity(response.getBody());

		for (final PhotoEntity photoEntity : entities) {
			System.out.println(photoEntity);
		}

		return "index";
	}

}

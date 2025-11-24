package com.example.springpractice.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springpractice.configure.ExternalUrlProperties;
import com.example.springpractice.dto.PhotoDto;

@Service
public class RestTemplateService {

	private final ExternalUrlProperties properties;

	public RestTemplateService(final ExternalUrlProperties properties) {
		this.properties = properties;
	}

	public ResponseEntity<List<PhotoDto>> get() {
		final RestTemplate restTemplate = new RestTemplate();
		final String url = this.properties.getUrl() + "?albumId=1";
		final ResponseEntity<List<PhotoDto>> response = restTemplate.exchange(
				url,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<PhotoDto>>() {
				});

		return response;
	}

}

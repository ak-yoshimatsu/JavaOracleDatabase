package com.example.springpractice.controller.api.db.impl;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.example.springpractice.controller.api.db.DbController;
import com.example.springpractice.dto.db.UserListOut;
import com.example.springpractice.service.db.DbService;

@RestController
public class DbControllerImpl implements DbController {

	private final DbService dbService;

	public DbControllerImpl(final DbService dbService) {
		this.dbService = dbService;
	}

	@Override
	public Map<String, String> index() {
		final Map<String, String> map = dbService.index();
		return map;
	}

	@Override
	public UserListOut users() {
		return this.dbService.users();
	}

}

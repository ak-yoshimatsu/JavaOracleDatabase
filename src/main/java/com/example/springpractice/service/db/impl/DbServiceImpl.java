package com.example.springpractice.service.db.impl;

import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.springpractice.dto.db.UserListOut;
import com.example.springpractice.mapper.db.UserMapper;
import com.example.springpractice.service.db.DbService;

@Service
public class DbServiceImpl implements DbService {

	private final UserMapper mapper;
	private final org.slf4j.Logger logger = LoggerFactory.getLogger(DbServiceImpl.class);

	public DbServiceImpl(final UserMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public Map<String, String> index() {
		final Map<String, String> map = Map.of("code", "SUCCESS", "message", "正常終了");

		return map;
	}

	@Override
	public UserListOut users() {
		final var users = this.mapper.getAll();

		logger.info(users.toString());

		final UserListOut out = new UserListOut();
		out.setUsers(users);

		return out;
	}
}

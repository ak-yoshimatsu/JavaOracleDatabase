package com.example.springpractice.service.db;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.springpractice.dto.db.UserListOut;

@Service
public interface DbService {

	/**
	 * サンプルメソッド
	 * @return マップオブジェクト
	 */
	Map<String, String> index();

	UserListOut users();
}

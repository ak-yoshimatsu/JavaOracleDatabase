package com.example.springpractice.controller.api.db;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpractice.dto.db.UserListOut;

@RestController
@RequestMapping(value = "/api/db")
public interface DbController {

	/**
	 * DBControllerサンプルメソッド
	 *
	 * @return マップオブジェクト
	 */
	@GetMapping()
	Map<String, String> index();

	@GetMapping("/users")
	UserListOut users();
}

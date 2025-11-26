package com.example.springpractice.dto.db;

import java.util.List;

import com.example.springpractice.entity.db.UserEntity;

public class UserListOut {

	private List<UserEntity> users;

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(final List<UserEntity> users) {
		this.users = users;
	}
}

package com.example.springpractice.entity.db;

import java.time.LocalDateTime;

public class UserEntity {

	private Long id;
	private String title;
	private String email;
	private String role;
	private LocalDateTime createdAt;

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title セットする title
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email セットする email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @return role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role セットする role
	 */
	public void setRole(final String role) {
		this.role = role;
	}

	/**
	 * @return createdAt
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(final LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}

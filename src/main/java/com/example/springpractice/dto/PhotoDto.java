package com.example.springpractice.dto;

/**
 * 外部APIのレスポンス形式に対応するDTO
 */
public class PhotoDto {

	private int albumId;
	private int id;
	private String title;
	private String url;
	private String thumbnailUrl;

	/**
	 * @return albumId
	 */
	public int getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId セットする albumId
	 */
	public void setAlbumId(final int albumId) {
		this.albumId = albumId;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(final int id) {
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
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url セットする url
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

	/**
	 * @return thumbnailUrl
	 */
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	/**
	 * @param thumbnailUrl セットする thumbnailUrl
	 */
	public void setThumbnailUrl(final String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
}

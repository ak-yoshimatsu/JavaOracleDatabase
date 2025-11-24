package com.example.springpractice.entity;

/**
 * アプリケーション内部で使用するエンティティ
 */
public class PhotoEntity {

	private int photoId;
	private String title;
	private String url;
	private String thumbnailUrl;

	/**
	 * @return photoId
	 */
	public int getPhotoId() {
		return photoId;
	}

	/**
	 * @param photoId セットする photoId
	 */
	public void setPhotoId(final int photoId) {
		this.photoId = photoId;
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

	@Override
	public String toString() {
		return "PhotoEntity photoId: " + getPhotoId() + ", title: " + getTitle();
	}
}

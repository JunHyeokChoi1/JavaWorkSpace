package com.youtube;

import java.util.Date;

public class Video {
	
	private String title;
	private String comment;
	private Date uploadAt;
	private int count;
	private String imageUrl;
	private String fileUrl;
	
	/*
	 * Create : 추가
	 * Read : 읽기
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	public Video upload() { // 영상 업로드
		return null;
	}
	public Video[] list() { // 영상 목록
		return null;
	}
	public Video viewVideo() { // 영상 1개 보기
		return null;
	}
	public Video updateVideo() { // 동영상 수정
		return null;
	}
	public boolean deleteVideo() { // 동영상 삭제
		return false;
	}
	public Video() {

	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imageUrl=" + imageUrl + ", fileUrl=" + fileUrl + "]";
	}
	
	
	
	
}

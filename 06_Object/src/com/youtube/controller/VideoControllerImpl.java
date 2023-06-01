package com.youtube.controller;

import com.youtube.controller.VideoController.Video;

public interface VideoControllerImpl {
	public Video upload(); //영상 업로드
	public Video[] list();  //영상 목록
	public Video viewVideo(); // 영상 1개 보기
	public Video updateVideo(); // 동영상 수정
	public boolean deleteVideo(); // 동영상 삭제
}

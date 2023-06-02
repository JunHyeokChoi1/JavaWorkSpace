package com.youtube.controller;


import com.youtube.Video;

public class VideoController implements VideoControllerImpl {
	
	Video[] videolist = new Video[5];
	int index = 0;
	
	@Override
	public Video upload(Video video) { //영상 업로드
		videolist[index++] = video;
	}

	@Override
	public Video[] videolist() {
		return videoList;
	}

	@Override
	public Video viewVideo(int index) { //동영상 1개 보기
		return videoList[index];
	}

	@Override
	public void updateVideo(int index, Video video) {
		videoList[intdex] = video;
	}

	@Override
	public boolean deleteVideo() {
		
	}

	@Override
	public Video upload(Video video) { //영상 업로드
		videolist[index++] = video;
	}

	@Override
	public Video[] videoList() {
		return videoList;
	}

	@Override
	public Video viewVideo() {
		return videoList[index];
		
	}

	@Override
	public void updateVideo(int index, Video video) {
		videoList[intdex] = video;
	}
	
}
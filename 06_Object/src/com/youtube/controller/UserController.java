package com.youtube.controller;

import com.youtube.User;

public class UserController implements UserControllerImpl{
	
	User user = null;
	@Override
	public boolean login(String id, String password) {
		if(user!=null && user.getId().equals(id) && user.getPassword().equals(password));
		return true;
	}

	@Override
	public boolean signUp() {
		this.user = user;
	}

	@Override
	public User viewProfile() {// 포로필 보기 (로그인 한 상태)
		if(login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}

	@Override
	public User updateProfile() { //포로필 수정(로그인 된 경우)
		if(login(this.user.getId(), this.user.getPassword())) {
			this.user = user;
		return this.user;
	}

	@Override
	public boolean deleteProfile(String id) { //계정삭제
		if(user.getId().equals(id)) {
			user = null;
	}
	
	}
}

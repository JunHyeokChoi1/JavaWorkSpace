package com.youtube;

public class User {
	
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;
	
	Video video;
		
	public boolean login() { // 로그인
		return false;
	}
	public boolean signUp() { // 회원가입
		return false;
	}
	public User viewProfile() { // 프로필 보기
		return null;
	}
	public User updateProfile() { // 프로필 수정
		return null;
	}
	public boolean deleteProfile() { // 계정 삭제
		return false;
	}
	
	public User() {
		
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", gender=" + gender + "]";
	}
}

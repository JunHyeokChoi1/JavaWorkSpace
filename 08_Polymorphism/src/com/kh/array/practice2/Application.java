package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.cotroller.MemberController;
import com.kh.array.practice2.model.Member;


public class Application {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public static void main(String[] args) {
		
	}
	
	public void mainMenu() {
		boolean check = true;
		while(check) {
			System.out.println("최대 등록 가능한 회원 수는 3명입니다");
			System.out.println("현재 등록된 회원 수는" + mc.count + "명입니다");
			if(mc.count <3) {
				System.out.println("1. 새회원등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찾기 때문에" + "일부 메뉴만 오픈됩니다");
			}
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("메누번호 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				this.insertMember();
				break;
			case 2:
				this.updateMember();
				break;
			case 3:
				this.printAll();
				break;
			case 9:
				check = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다");
		}
	}
}
	public void insertMember() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		// mc.checkId 활용 중복된 아이디 체크
		
		//아이디가 있는 경우 중복된 아이디입니다. 다시 입력해주세요
		// ---> 조건문 사용
		if(mc.checkId(id)!= -1) {
			System.out.println("중복된 아이디입니다 다시 입력해주세요");
			this.insertMember();
		} else {
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.println("이메일: ");
			String email = sc.nextLine();
			
			System.out.println("성별: ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.println("나이 :");
			int age = Integer.parseInt(sc.nextLine());
			
			Member m = new Member(id, name, password, email, gender, age); 
		}
		
		
		//1번의 경우 
		//mc.inserMember(m);
		//2번의 경우 - 생성자로 값 임시 저장해서 넘기고 있음
//		Member m = new Member(id, name, password, email, gender, age);
		//Member m = new Member();
		//m.setId(id);....
	}
	public void updateMember() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		if(mc.checkId(id)==1) {
			System.out.println("회원 정보가 없습니다");
			return;
		}
		
		// id를 조회해서 회원 정보가 없다면 "회원 정보가 없습니다" 출력
		System.out.println("수정할 회원의 이름 : ");
		String name = sc.nextLine();
		
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();
		
		System.out.println("수정할 비밀번호 : ");
		String password = sc.nextLine();
		
		mc.updateMember(id, name, password, email);
	}
	
	public void printAll() {
		Member[] mArr = mc.printAll();
		for(Member m : mArr) {
			if(m!=null)System.out.println(m);
		}
	}
}

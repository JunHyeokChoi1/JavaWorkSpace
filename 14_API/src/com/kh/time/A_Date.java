package com.kh.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A_Date {

	public static void main(String[] args) {
		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();
	}
	
	/*
	 * Date
	 * -java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK 1.0)
	 * Date의 메서드는 대부분 deprecated(비권장) 되어있지만 여전히 사용
	 */
	
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템 시간에 대한 정보를 가지고 객체 생성
		Date today =new Date();
		System.out.println(today);
		
		//한국시간(KST)으로 출력될땐 그리니치 평균시(GMT)보다 +9 증가된 시간으로 표시
		Date When = new Date(0);
		System.out.println(When);
	
		System.out.println();
		
		// Deprecated 기능들!
		System.out.println("getYaer : " + (today.getYear()+1900)+"년");
		System.out.println("getMonth:" + (today.getMonth()));
		System.out.println("getDate:"+ today.getDate() + "일");
		System.out.println("getHourd: " + today.getHours()+"시");
		System.out.println("getMinuted : " + today.getMinutes() + "분");
		System.out.println("getSecond : " + today.getSeconds() + "초");
		
		System.out.println();
		
		/*
		 * SimpleDataFormat클래스 : 날짜 데이터를 원하는 형태로 출력 할 수 있도록
		 * y:년도 
		 * M:월 
		 * D:년의몇번째일 
		 * d:월의 몇번째일
		 * E:요일
		 * a:오전/오후
		 * H:시간(0~23)
		 * h:시간(1~12)
		 * m:분
		 * s:초
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		//2023년 6월 13일 (화) 어후 2시21분10초
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
		formatDate = sdf.format(today);
		System.out.println(formatDate);
		
	}
	/*
	* Calendar
	 * Date 클래스를 개선한 추창 클래스(JDK 1.1) 여전히 단점 존재
	*/
		
	public void method2() {
//		Calendar cal = new Calendar(); 추상클래스는 객체 생성 X
		Calendar today = Calendar.getInstance();
		today= new GregorianCalendar(); //태국은 	BuddhistCalendar
		System.out.println(today);
		
		System.out.println();
		
		System.out.println("YEAR : " + today.get(Calendar.YEAR)+"년");
		System.out.println("MONTH : " + today.get(Calendar.MONTH) +1+ "월");
		System.out.println("DATE : " + today.get(Calendar.DATE)+ "일");
		System.out.println("HOUR : " + today.get(Calendar.HOUR)+ "시"); //0~11
		System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY)+ "시"); //0~23
		System.out.println("MINUTE : "+today.get(Calendar.MINUTE));
		System.out.println("SECOND: " + today.get(Calendar.SECOND)+"초");
		
		System.out.println("");
		
		//날짜지정
		Calendar date = Calendar.getInstance();
		date.set(2023, 5, 15);
		System.out.println(date);
		System.out.println(date.getTime().toString());
		
		date.getTimeInMillis();
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분의 1초:" + timeInMillis);
		long second = timeInMillis/1000;
		System.out.println("초: " + second);
		long minute = second/60;
		System.out.println("분 : " + minute);
		long hour = minute/60;
		System.out.println("시간 : " + hour);
		long day = hour/24;
		System.out.println("일 : " + day);
		long year = day/365;
		System.out.println("년: " + year);

		System.out.println();
		
		//SimpleDateFormat 클래스 사용!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formatDate = sdf.format(date.getTime());
		System.out.println(formatDate);
		
	}
	public void method3() {
		
		//1. Calendar -> Date
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		System.out.println(d);
		
		//2. Date -> Calendar
		Date d2 = new Date();
		Calendar ca12 = Calendar.getInstance();
		ca12.setTime(d2);
		System.out.println(ca12.getTime().toInstant());
		
	}
	
	// 자신이 태어날 날을 yyyy/MM/dd 형태로 입력받아 해당 날짜가 무슨 요일이었는지, 지금까지 며칠이 지났는지 계산
	// 입력된 형식이 잘못된 경우 다시 입력받기
	public void practice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		String br = sc.nextLine();
		
		String[] date = br.split("/");
		System.out.print();
		
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
		
//		Calendar ca12 = Calendar.getInstance();
//		ca12.setTime(today);
//		System.out.println(ca12.getTime().toInstant());
		
//		 - ca12.setTime(today);
		
		
		
		// 문자열 -> 데이트 -> cal 
		
	}
		
}

package com.kh.step4;

import javax.swing.JOptionPane;

import com.kh.step3.BeepPrintThread;

public class InputThreadTest2 {
	
	boolean inputCheck = false;

	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
		Thread t2 = new Thread(new InputThread(process));
		Thread t = new Thread(new CountThread(process));
		t.start();
		t2.start();
		
	}

	public class CountThread implements Runnable {

		@Override
		public void run() {
			for(int i=10; i>0; i--) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {}
			}
		
		if(!process.inputCheck) {
			System.out.println("10초 경과 되었습니다.. 값 입력 초과!!");
		}
	}	
	
	
	public class InputThread2 implements Runnable{
		
		InputThreadTest2 process;
		
		InputThread(InputThreadTest2 process) {
			this.process = process;
			System.exit(0);
		}

		@Override
		public void run() {
			
			String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.....");
			System.out.println("입력하신 숫자는 " + input + " 입니다");
			
			process.inputCheck = true;
		}
	}
	
	
	
}




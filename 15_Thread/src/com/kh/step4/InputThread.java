package com.kh.step4;

public class InputThread implements Runnable{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//2. 카운팅 작업
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {}
			
		
		}
	}
}

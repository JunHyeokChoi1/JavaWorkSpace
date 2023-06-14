package com.kh.step4;

import javax.swing.JOptionPane;

import com.kh.step3.BeepPrintThread;

public class InputThreadTest {

	public static void main(String[] args) {
		
		
		InputPrintThread ipt = new InputPrintThread();
		Thread iptThread = new Thread(ipt, "InputPrintThraed");
		
		InputThread it = new InputThread();
		Thread itThread = new Thread(it, "InputThread");
		
		iptThread.start();
		itThread.start();
	}
	
}

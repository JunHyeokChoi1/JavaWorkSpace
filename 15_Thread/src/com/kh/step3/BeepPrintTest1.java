package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
		BeepPrintThread bpt = new BeepPrintThread();
		Thread bptThread = new Thread(bpt, "BeepPrintThread");
		
		BeepThread bt = new BeepThread();
		Thread btThread = new Thread(bt, "BeepThread");
		
		
		bptThread.start();
		btThread.start();
	}
}

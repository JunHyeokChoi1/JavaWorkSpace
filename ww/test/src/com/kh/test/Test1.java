package com.kh.test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
	}
	
	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/output/test.txt");
			fw.write(97);
			fw.write(65);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

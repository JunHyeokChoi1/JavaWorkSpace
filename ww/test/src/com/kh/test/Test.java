package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.test.person.model.vo.Person;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.client();
		t.server();
	}
	
	public void client() {
		int port = 3000;
		String serverIP = "192.168.20.34";
		try {
			serverIP = InetAddress.getLoopbackAddress().getHostAddress();
			Socket socket = new Socket(serverIP, port);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

	public void server() {
		int port = 3000;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			boolean check = true;
			while(true) {
				Socket client = server.accept();
				check = false;
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

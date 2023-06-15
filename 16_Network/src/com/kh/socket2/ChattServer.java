package com.kh.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {
	
	// 클라이언트가 보낸 메지를 밭아서 다시 클라이트에게 받은 메세지를 보낸다.
	// PrintWriter
	
	public static void main(String[] args) {
		try {
			//1.ServerSocket 생성(port)
			ServerSocket server = new ServerSocket(60000);	//엄거나 써도됨
			
			//2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket을 
			// 하나 리턴
			Socket s = server.accept();
			
			// 3.소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println("[:" + s.getInetAddress() + "]가 보낸 메세지: " + line);
				pw.println(line);
			}
			
			
			br.close();
		} catch (IOException e) {
			System.out.println("Client와의 연결이 끊어졌습니다..");
		}
	}
	
}
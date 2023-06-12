package com.kh.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerializationTest {

	public static void main(String[] args) {
		SerializationTest s =new SerializationTest();
		s.filesave();
//		s.fileread();
//		s.objectSave();
//		s.objectRead();
	}
	
	// 직렬화(Serialization : 객체를 데이터 스트링으로 만드는것
	public void filesave() {
		String fileName = "src/person.obj";
		ObjectOutputStream oos = null;
		
		//1.스트림 생성
		// FileOutputStream : 파일 출력에 사용되는 기본 바이트 스트림 클래스
		// objectOutputStream : 객체 단위로 출력 시에 사용되는 보조 바이트 스트림 클래스
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		//2.객체 생성
		Person p = new Person("제니", 27, "jennierubyjane");
		
		//3. 날린다.
		oos.writeObject(p);
		System.out.println("peron.obj 파일에 정보 저장");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//4.자원반납
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 역직렬화(deserialization) : 저장된 내용이나 전송받은 내용을 다시 복원하는것
	public void fileread() {
		
		//FileInputStream : 파일로부터 데이터를 읽어 들이기 위해 사용하는 기본 바이트 스트림 클래스
		//ObjectInputStream : 스트림으로부터 객체 단위로 읽기 위해 사용되는 보조 바이트 스트림 클래스
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/person.obj"))) {
			Person p = (Person)ois.readObject();
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	// 여러 객체를 저장
	public void objectSave() {
		
		List<Person> list = Arrays.asList(
				new Person("제니", 27, "jennierubyjane"),
				new Person("지수", 28, "sooyaaa__"),
				new Person("로사", 26, "roses_are_rosie"),
				new Person("뷔", 27, "thv"),
				new Person("지민", 27, "j.n")
		);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Object.obj"))){
			
			for(Person person : list) {
				oos.writeObject(person);
			}
			System.out.println("objects.obj 파일에 정보 저장");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// 파일에 저장한 데이터 읽기
	public void objectRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/objects.obj"))) {

			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (EOFException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

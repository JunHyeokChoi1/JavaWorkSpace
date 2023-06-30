package test;

import java.util.ArrayList;

import com.kh.test.shape.model.vo.Fruit;

public class MyColletion {
	
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		list.add(new Fruit("과", "맛있는 과일"));
		
		for(int i=0; i<=list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

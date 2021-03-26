package oop11.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApiTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("가");
		list.add("나");
		list.add("가");
		list.add("다");
		list.add("라");
		list.add(1, "바");
		list.remove(1);
		
		System.out.println(list.indexOf("가"));
		System.out.println(list.lastIndexOf("가"));
		printList(list);
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) System.out.println(iter.next());
		
	}private static void printList(List<String> list) {
		System.out.print("size : "+list.size()+"\t");
		for(String tmp : list)
			System.out.print(tmp+"\t");
	}
}

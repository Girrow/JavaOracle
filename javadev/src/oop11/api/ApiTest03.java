package oop11.api;

import java.util.HashMap;
import java.util.Iterator;

public class ApiTest03 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("박보검", "010-1111-1111");
		map.put("정해인", "010-1111-2222");
		map.put("박서준", "010-1111-3333");
		map.put("양세종", "010-1111-4444");
		
//		Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			System.out.println(key + ": "+map.get(key));
//		}
		
		for(String key : map.keySet())
			System.out.println(key + ": "+map.get(key));

	}
}

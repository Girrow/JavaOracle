package oop11.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ApiTest02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("가");
		set.add("나");
		set.add("가");
		set.add("다");
		set.add("라");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) System.out.println(iter.next());
		
	}
}

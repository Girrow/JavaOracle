package javadev;

import java.util.stream.IntStream;

public class WhileTest02 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while((i+=3) <=1000) sum+=i;
		System.out.println(sum);
		
		int a = IntStream
				.rangeClosed(1, 1001)
				.filter(d -> d % 3 == 0)
				.sum();
		System.out.println(a);
	}
}

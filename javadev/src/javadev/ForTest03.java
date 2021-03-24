package javadev;

import java.util.stream.IntStream;

public class ForTest03 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=3;i<=1000;i+=3) sum+=i;
		System.out.println(sum);
		
		int a = IntStream.rangeClosed(1, 1001).filter(d -> d % 3 == 0).sum();
		System.out.println(a);
	}
}

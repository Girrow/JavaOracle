package javadev;

import java.util.stream.IntStream;

public class DoWhileTest01 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		do sum+=i;
		while((i+=3) <=1000); 
		System.out.println(sum);
	}
}

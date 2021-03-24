package javadev;

import java.util.stream.IntStream;

public class ContinueTest01 {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).filter(a -> a% 3 ==0).sum();
		System.out.println(sum);
	}
}

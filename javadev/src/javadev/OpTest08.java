package javadev;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ui = sc.nextInt();
		String a = (ui % 2) ==1?"홀수":"짝수";
		System.out.println(a);
	}
}

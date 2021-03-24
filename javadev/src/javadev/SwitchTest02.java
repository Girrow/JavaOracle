package javadev;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		int ui = new Scanner(System.in).nextInt();
		switch (ui) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		}
	}
}

package javadev;

import java.util.Scanner;

public class SwitchTest03 {
	public static void main(String[] args) {
		int ui = new Scanner(System.in).nextInt();
		char c = 65;
		switch(ui/10) {
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		
		System.out.println(c);
	}
}

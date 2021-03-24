package javadev;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ui =sc.nextInt();
		char c = 65;
		
		if(ui>=90) c='A';
		else if(ui>=80) c='B';
		else if(ui>=70) c='C';
		else if(ui>=60) c='D';
		else c='F';
		
		System.out.println(c);
	}
}

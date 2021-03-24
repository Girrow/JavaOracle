package javadev;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 100, 90, 80, 70 },
				{ 90, 80, 70, 60 },
				{ 80, 70, 60, 50 } 
				};
		int sum=0;
		
		System.out.println("\t\t[성적표]");
		System.out.println("==============================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		for(int row=0;row<arr.length;row++) {
			
			for(int col=0;col<arr[row].length;col++) System.out.print(arr[row][col]+"\t");
			sum = Arrays.stream(arr[row]).sum();
			
			System.out.printf("%d\t%d\n",sum,sum/arr[row].length);
		}
	}
}

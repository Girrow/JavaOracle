package oop11.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("연도 입력 : ");
//		int year = sc.nextInt();
		int year = 2021;
		System.out.printf("월 입력 : ");
//		int month = sc.nextInt();
		int month = 3;
		drawCalendar(year, month);
		sc.close();
	}

	public static void drawCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();

		int sweek = 0;
		int eday = 0;
		cal.set(year, month - 1, 1);
		sweek = cal.get(Calendar.DAY_OF_WEEK);
		eday = cal.getActualMaximum(Calendar.DATE);
		System.out.println(sweek + " : " + eday);

		System.out.printf("%d 년 %d 월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 1; i < sweek; i++)
			System.out.print("\t");
		for (int i = 1, w = sweek; i <= eday; i++, w++) {
			System.out.print(i + "\t");
			if (w % 7 == 0)
				System.out.println();
		}
	}
}

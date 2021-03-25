package oop02.static02;

public class CalTest {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.printf("result1 : %f \nresult2 : %d \nresult3 : %d\n",result1,result2,result3);
	}
}

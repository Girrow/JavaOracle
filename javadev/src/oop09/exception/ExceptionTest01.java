package oop09.exception;

public class ExceptionTest01 {
	public static void main(String[] args){
		String data1 = "100";
		String data2 = "a100";
		
		int value = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value + value2;
	}
}

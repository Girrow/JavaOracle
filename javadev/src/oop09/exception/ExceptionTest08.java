package oop09.exception;

public class ExceptionTest08 {
	public static void main(String[] args) {
		throwException();
	}

	private static void throwException() {
		System.out.println("throwException Method start");
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("throwException Method end");
	}
}

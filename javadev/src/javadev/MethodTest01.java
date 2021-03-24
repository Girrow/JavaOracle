package javadev;

public class MethodTest01 {
	public static void main(String[] args) {
		print();
		print("ha");
		System.out.println(Math.addExact(7, 4));
	}
	
	private static int mod(int a,int b) {
		return a % b;
	}
	private static int div(int a,int b) {
		return a / b;
	}
	private static int mul(int a,int b) {
		return a * b;
	}
	private static int sub(int a,int b) {
		return a - b;
	}
	private static int add(int a,int b) {
		return a + b;
	}
	private static void print(String name) {
		System.out.println("Hello, "+name);
		
	}

	private static void print() {
		System.out.println("Hello, World!");
	}
}

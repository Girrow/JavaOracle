package oop11.api;

public class ObjectTest04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, World!");
		printString(sb);
		sb.append("Hello, World!");
		printString(sb);
		sb.insert(6, "Halo,");
		printString(sb);
		
		sb.reverse();
		printString(sb);
	}

	private static void printString(StringBuilder sb) {
		System.out.println(sb.length()+" : "+sb.capacity());
		System.out.println(sb.toString());
	}
}

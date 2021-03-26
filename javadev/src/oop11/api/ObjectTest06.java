package oop11.api;

public class ObjectTest06 {
	public static void main(String[] args) {
//		Integer i = 15;
		Object obj = (Integer)15;
		Integer n = (Integer)obj;
		System.out.println(n + " -> "+Integer.toBinaryString(n));
		System.out.println(n + " -> "+Integer.toOctalString(n));
		System.out.println(n + " -> "+Integer.toHexString(n));
	}
}

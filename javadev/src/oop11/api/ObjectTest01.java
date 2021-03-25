package oop11.api;

class Point{}
public class ObjectTest01 {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt.getClass());
		System.out.println(pt.hashCode());
		System.out.println(pt.toString());
		
		System.out.println();
		
		Point pt2 = new Point();
		System.out.println(pt2.getClass());
		System.out.println(pt2.hashCode());
		System.out.println(pt2.toString());
	}
}

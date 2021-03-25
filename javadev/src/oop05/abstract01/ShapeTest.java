package oop05.abstract01;

import java.lang.reflect.Field;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		try {
			printArea(c);
			printArea(r);
			printArea(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void printArea(Shape s){
		s.area();
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.printf("반지름이 %d 인 원의 넓이는 %f \n",c.r,c.res);
		}else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.printf("가로가 %d ,세로가 %d인 사각형의 넓이는 %1.0f \n",r.w,r.h,r.res);
		}else if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.printf("밑변이 %d ,높이가 %d인 사각형의 넓이는 %1.0f \n",t.w,t.h,t.res);
		}
//		c.area();
//		System.out.printf("반지름이 %d인 원의 넓이는 %f \n",c.r,c.res);
	}
}

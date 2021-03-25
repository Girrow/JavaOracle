package oop05.abstract01;

public class Triangle extends Shape {
	int w=10,h=5;
	
	@Override
	public void area() {
		res=w*h/2;
	}


}

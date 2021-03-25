package oop05.abstract01;

public class Circle extends Shape {
	int r=10;
	
	@Override
	public void area() {
		res=r*r*Math.PI;
	}

}

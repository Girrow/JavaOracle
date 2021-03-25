package oop04;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();
		up.x=10;
		up.y=20;
//		up.z=30;
		((Point3D)up).z=30;
		
	}
}

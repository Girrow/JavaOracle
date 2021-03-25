package oop01;

public class Point3D extends Point2D{
	private int z;
	
	public Point3D() {
		this(10,20,30);
		System.out.println("Point3D() 수행 중");
		this.print();
	}

	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
//		this.setX(x);
//		this.setY(y);
//		this.setZ(z);
		System.out.println("Point3D(x,y,z) 수행 중");
	}
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("z="+this.getZ());
	}
	
	
}

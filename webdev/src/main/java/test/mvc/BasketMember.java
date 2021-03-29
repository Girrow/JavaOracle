package test.mvc;

public class BasketMember {
	private String name;
	private String position;
	private int no;
	private double point;
	
	
	public BasketMember(String name, String position, int no, double point) {
		super();
		this.name = name;
		this.position = position;
		this.no = no;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
}

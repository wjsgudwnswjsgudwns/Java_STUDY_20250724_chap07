package ch07.part03;

public class Circle extends Shape{

	private int radius;
	static final double PI = 3.141592;
	
	// 생성자
	public Circle() {
		super();
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	// getter & setter
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	// 메소드
	public double getArea() {
		return radius * radius * PI ;
	}
	public void getColor(String color) {
		System.out.println(color);
	}
}

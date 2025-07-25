package ch07.part03;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	// ******************생성자*******************
	public Triangle() {
		super();
	}
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// *************** getter & setter ************** 
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 
	
	public double getArea() {
		return width * height * 0.5;
	}
	
	public void getColor(String color) {
		System.out.println(color);
	}
	
}

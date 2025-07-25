package ch07.part03;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	// ******************생성자*******************
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
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

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void getColor(String color) {
		System.out.println(color);
	}
	
}

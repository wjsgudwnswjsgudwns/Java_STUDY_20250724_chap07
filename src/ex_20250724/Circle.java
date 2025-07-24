package ex_20250724;

public class Circle extends Shape{

	double radius;
	
	public double area() {
		double area = radius * radius * PI;
		return area;
	}
}

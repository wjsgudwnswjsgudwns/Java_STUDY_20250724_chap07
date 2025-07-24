package ch07.part01;

public class Triangle extends Shape {
	
	@Override
	public double area() { // 메소드 오버라이딩
		
		double area = width * height * 0.5;
		// 메소드를 재정의를 함.
		
		return area;	
	}
	
	
}

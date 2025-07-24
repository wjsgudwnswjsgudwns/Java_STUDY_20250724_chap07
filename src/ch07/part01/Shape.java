package ch07.part01;

public class Shape { // 부모 클래스
	
	int width;
	int height;
	String color;
	
	
	
	public double area() { // 도형의 면적 계산 메소드
		double area = width * height;
		return area; 
	}
}

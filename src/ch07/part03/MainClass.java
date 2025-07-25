package ch07.part03;

public class MainClass {

	public static void main(String[] args) {
		
//		Shape shape = new Shape(); //Shape는 추상 클래스라서 인스턴스 생성이 불가능하다.
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("사각형의 넓이 : " + rectangle.getArea());
		rectangle.getColor("red");
		
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println("원의 넓이 : " + circle.getArea());
		circle.getColor("blue");
		
		Shape shape = new Triangle(10, 20);
		System.out.println("삼각형의 넓이 : " + shape.getArea());
		
		Triangle triangle = (Triangle) shape;
		triangle.getColor("green");
		
	}

}

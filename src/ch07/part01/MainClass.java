package ch07.part01;

import java.security.Identity;

public class MainClass {

	public static void main(String[] args) {
		
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.height = 10;
		rectangle.width = 20;
		rectangle.color = "";
		
		rectangle.recArea = 50.5;
		
		System.out.println("===================================");
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("백구", 10);
		
		System.out.println(dog2.sound);
		
		System.out.println("===================================");
		
		Person person = new Person("맹구");
		Student student = new Student("철수", 3);
		student.name = "짱구";
		System.out.println(student.name);
		
		System.out.println(System.identityHashCode(person));
		System.out.println(System.identityHashCode(student));
		
		System.out.println("===================================");
		
		Triangle triangle = new Triangle();
		
		triangle.width = 10;
		triangle.height = 5;
		triangle.color = "red";
		
		System.out.println(triangle.area());
	}

}

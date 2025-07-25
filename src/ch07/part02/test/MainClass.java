package ch07.part02.test;

public class MainClass {

	public static void main(String[] args) {

//		*******************업 캐스팅******************
		Animal animal = new Dog(); // upcasting
		
		animal.name = "백구";
//		animal.age = ; // 사용 불가 -> 자식 클래스에서 만들어진 필드이기 때문에
		animal.sound(); // 오버라이딩 된 메소드가 나옴.
		
		System.out.println("===================================");
//		*******************다운 캐스팅******************
		Dog dog2 = (Dog) animal; // downcasting
		
		dog2.age = 5;
		dog2.name = "황구";
		dog2.sound();
		
		System.out.println("===================================");
//		***********************************************
		
		Animal animal2 = new Animal(); // 인스턴스화 시켜서 실제객체가 Animal 클래스로 만들어짐
//		Dog dog2 = (Dog) animal2; // ClassCastException 오류 발생
		
		System.out.println("===================================");
		
//		*******************업 캐스팅******************
		Animal animal3 = new Cat();
		animal3.name = "나비";
//		animal3.eat = "나비"; // 자식 필드 접근 불가.
		animal3.sound(); // Cat 클래스에는 sound 메소드 오버라이딩이 없기 때문에 부모 클래스의 sound가 나옴
		
		System.out.println("===================================");
		
//		*******************다운 캐스팅******************
		Cat cat = (Cat) animal3;
		cat.name = "나비";
		cat.eat(); // 
		
		System.out.println("===================================");
		
		Dog dog3;
		// 다운캐스팅을 할때 instanceof 연산자로 확인후 다운캐스팅을 하면 안전하게 다운캐스팅 가능
		if (animal instanceof Dog) { // true -> animal이 Dog 클래스로 만든 객체를 참조하고 있다는 것을 확인
			dog3 = (Dog) animal;
			dog3.sound();
		}
	}

}

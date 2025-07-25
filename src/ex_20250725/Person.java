package ex_20250725;

public abstract class Person {
    
	String name;
    
    public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public abstract void sayHello();
	
	public static void printHi() {
		System.out.println("안녕하세요. 반갑습니다!");
	}
}
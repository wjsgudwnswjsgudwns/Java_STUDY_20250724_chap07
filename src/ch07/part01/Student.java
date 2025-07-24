package ch07.part01;

public class Student extends Person{ // 자식 클래스
	
	int grade; // 학년

	public Student(String name, int grade) {
		super(name); 		// 부모생성자 호출하면서 name 값을 필드값으로 넘겨줌 	
		this.grade = grade; // 
	}
	
	

}

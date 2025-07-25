package ch07.part02;

public class MainClass {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Student student = new Student();
		
		Solider solider = new Solider();
		
		person = student;  //  부모는 자식의 모든 것을 받아들인다. (자동 형변환)
		student = (Student) person;  // 강제 형변환 
//		solider = student; // 얘는 그냥 안됨.
		
		Person person2 = new Student();
		// Person person2 = new Person();
		// person2 = student;
		person2 = new Solider();
		person2.namePrint("ㅁㄴㅇ");
		
		
		Person person3 = new Solider();
		
		
		System.out.println("===============================");
		
		Car mycar = new Car();
		
		mycar.carName = "소나타";
		mycar.year = 2010;
		
		mycar.frontTire = new KumHoTire();
		
		mycar.rearTire = new HankookTire();
		
		HankookTire hankookTire = new HankookTire();
		KumHoTire kumHoTire = new KumHoTire();
		
		mycar.tirePrint(hankookTire);
		mycar.tirePrint(kumHoTire);
	}

}

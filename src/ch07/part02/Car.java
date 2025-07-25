package ch07.part02;

public class Car {

	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
//	Tire frontTire = new KumHoTire(); // 앞바퀴 금호타이어
//	Tire rearTire = new HankookTire(); // 뒷바퀴 한국타이어
	
	Tire frontTire; // 앞바퀴
	Tire rearTire; // 뒷바퀴
	
	// 2. 매개변수에 인수로 금호타이어 객체가 들어오면 금호, 한국타이어 객체가 들어오면 한국이라고 출력하는 메소드
	public void tirePrint(Tire tire) { 
		// 1. 타이어의 이름을 출력한다 하자
		tire.tireName();
	}
}

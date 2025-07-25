package ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire = new KumHoTire(); // 자동 형변환 = upcasting
		// 부모는 태생이 한개의 층만 접근이 가능한 곳이라 본인꺼 밖에 사용 못함. 
		// 자식 필드 사용 불가
		
		
		KumHoTire kumho2;
		kumho2 = (KumHoTire) tire;  // 강제 형변환 = downcasting
		kumho2.tireName(); // 부모 필드 가능
		// 자식은 태생이 두개의 층이 사용 가능해서 부모,자식 둘 다 사용 가능함.
		
//		HankookTire hankookTire = (HankookTire) new Tire();
//		hankookTire.tireName = "";
//		
	}

}

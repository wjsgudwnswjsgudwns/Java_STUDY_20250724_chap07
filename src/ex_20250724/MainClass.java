package ex_20250724;

public class MainClass {

	public static void main(String[] args) {
		
		Truck truck = new Truck();
		truck.sits = 2;
		truck.wheels= 10;
		truck.luggage = 30000;
		truck.doors = 2;
		truck.height = 3;
		
		SportCar sportCar = new SportCar();
		sportCar.brandName = "";
		sportCar.doors = 4;
		sportCar.engine = "";
		sportCar.highSpeed = 350;
		sportCar.sits = 4;
		sportCar.wheels = 4;
		
		Bus bus = new Bus();
		bus.doors = 2;
		bus.wheels = 8;
		bus.sits = 20;
		
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.bark();
		
		Tiger tiger = new Tiger();
		tiger.bark();
	}

}

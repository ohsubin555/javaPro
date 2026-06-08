package days13;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 * [클래스들 간의 관계]
		 * 1. 집합(소속) 관계: has-a 관계
		 * ex) class of " Car " -> Car > Engine 
		 * 
		 * 2. 상속 관계: is-a 관계
		 * 
		 * 
		 * 
		 */
		
		
		Engine engine = new Engine();
		Car myCar = new Car(engine); // dependency inject by producer
		myCar.speedUP(100);
		System.out.println(myCar.getEngine().speed);
		
		Engine nEngine = new Engine();
		myCar.setEngine(nEngine); // di

	}

}

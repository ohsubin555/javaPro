package days11;

public class Ex03 {

	public static void main(String[] args) {

//
		Car myCar = null;
//		
		myCar = new Car();
//		//The local variable myCar may not have been initialized
//		myCar.name ="K9";
		
		
		testInstance(myCar);

	}

	private static void testInstance(Car myCar) {
		myCar.name = "K3";
		myCar.dispCarInfo();
		
	}

}

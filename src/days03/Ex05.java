package days03;

public class Ex05 {

	public static void main(String[] args) {
		
		String name = "오수빈";
		
		name = name + "," + "신창만";
		name = name + "," + "이창익";
		
		//변수 = 변수 + 피연산자
		//  name = name + "," + "이창익";
		name += "," + "이창익";
		name += "," + "오수빈";
		
		System.out.printf("%s", name);
		
		

	}// main

}//class

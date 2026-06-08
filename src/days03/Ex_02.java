package days03;

public class Ex_02 {

	String address; // 인스턴스 변수
	static double pi; // 클래스 변수 

	public static void main(String[] args) {

		// Ctrl A + Ctrl I --> 라인정렬 / 에러메시지

		String name = "찰떡꼬치";
		// {} 영역(범위) 연산자

		{

			int age = 20;
		
		// The local variable name may not have been initialized
		//age cannot be resolved to a variable
		System.out.printf("> name:%s, age:%d\n", name, age);
		}
	}

}

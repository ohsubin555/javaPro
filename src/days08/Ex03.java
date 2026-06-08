package days08;

/**
 * @author subin
 * @date 2026. 5. 20. 오전 10:12:10
 * @subject 재귀 함수
 * @content 함수안에서 자기 자신을 다시 호출하는 함수.
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		disp();

	}//main

	private static void disp() {
		System.out.println("실행문");
		System.out.println("실행문");
		System.out.println("실행문");
		disp();

		
		
	}

}//class

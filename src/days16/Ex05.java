package days16;

public class Ex05 {

	public static void main(String[] args) {
		//[Wrapper 클래스]
		// 기본형 -> 기능을 구현한 클래스
		// [오토박싱/오토 언박싱] 용어 이해
		
		int i = 100;
		Integer j = i; //기본형이 자동으로 래퍼클래스로 변환 -> 오토박싱
		
		int k = j; // 래퍼클래스 객체가 자동으로 자동으로 기본형으로 변환 -> 오토 언박싱 

		
		disp(10);
		
	
	}
	
	static void disp(Object obj) { // 10(int) -> Integer -> Object
		System.out.println(obj);
	}

}

package days03;


/**
 * @author subin
 * @date 2026. 5. 13. 오후 2:00:57
 * @subject 대문자 <-> 소문자 
 * @content  A          a
 * 문자 -> 문자코드표 -> 1:1 정수 매핑 - 2진수 표현 
 * 'A' 65
 * 'a'  97
 * '0'  48
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.printf("\'%c'(%d)\n", 'A', (int)'A');
		System.out.printf("\'%c'(%d)\n", 'Z', (int)'A');
		System.out.printf("\'%c'(%d)\n", 'a', (int)'A');
		System.out.printf("\'%c'(%d)\n", 'z', (int)'A');
		System.out.printf("\'%c'(%d)\n", '0', (int)'A');
		System.out.printf("\'%c'(%d)\n", '9', (int)'A');
		
		
		// 대문자 +32 = 소문자 변환
		// 소문자 -32 = 대문자 변환
		
		System.out.println('A'-'a');
		System.out.println('a'-'A');
		
		
	}

}

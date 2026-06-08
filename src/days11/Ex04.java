package days11;

import java.util.Arrays;

/**
 * @author subin
 * @date 2026. 5. 26. 오후 12:15:52
 * @subject 가변인자 (==가변 길이의 매개변수)
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.sum(1, 2);
		System.out.println( result );

		result = calc.sum(1, 2, 3); // 세 정수의 합
		System.out.println( result );

		//		result = calc.sum(1, 2, 3, 4); // 세 정수의 합
		//		System.out.println( result );
		//		
		//		result = calc.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 세 정수의 합
		//		System.out.println( result );
		int [] m = {1,2,3,4,5,6,7,8,9,10};
		result = calc.sum(m);
		System.out.println( result );
		
		
		// System.out.printf("AAA").printf("BBB").print("CCC");

	} // main

} // class


class Calculator{

	// sum() 오버로딩( Overload )
//	int sum(int a, int b) {
//		return a + b;
//	}
//
//	// sum()
//	int sum(int a, int b, int c) {
//		return a + b + c;
//	}

	// sum()
//	int sum(int [] m) { 
//		return Arrays.stream(m).sum();
//	}
	
	int sum(int... m) {
		return Arrays.stream(m).sum();
	}

	// + - * /
	int plus() {
		return 0;
	}

}



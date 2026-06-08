package days04;

/**
 * @author subin
 * @date 2026. 5. 14. 오전 11:35:27
 * @subject ++n 전위형 증감연산자
 * @content n++ 후위형 증감연산자
 *          차이점? 단독으로 사용될때는 동일한 결과 값을 가진다. but 다른 수식이랑 사용되면 후위형은 가장 마지막 순서에 처리함.
 */
public class Ex06_03 {

	//public static void main(String[] args) {
		
		int x = 10;
		//int y = x++; // 후위형 증감연산자. >x=11 y=10
		  int y = ++x; // 전위형 x,y = 11
		  
		   public static void main(String[] args) {
			      
			      int x = 10;
			      // int y = x++; // 후위형 증감연산자.   > x=11, y=10
			      int y = ++x; // 전위형 증감연산자.      > x=11, y=11
			      
			      // while( 10 > x++) {}
			      // while( 10 > ++x) {}
			      
			      System.out.printf("> x=%d, y=%d\n", x, y );

			      
			      // int y = ++x + x-- + x++; X

			
		

		
		
		
	}//main

}//class

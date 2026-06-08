package days04;

/**
 * @author subin
 * @date 2026. 5. 14. 오전 10:25:59
 * @subject 조건(삼항)연산자
 * @content 덧셈(이항)
 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		//int result = 30 > 5 ? 100 : 200;
		int x = 30, y;	
		y= ( x>5 ? (x <10 ? 1 :2) :200);

		System.out.println(y);


	}//main

}//class

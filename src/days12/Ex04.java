package days12;

/**
 * @author subin
 * @date 2026. 5. 27. 오전 11:36:06
 * @subject 생성자 constructor)
 * @content 위치를 나타넬때  x y 좌표 필요. -> 위치를 나타내는 속성, 메소드를 구형한 크ㄹ래스 선언 ; Point
 *  *          1) 일종의 메소드이다.
 *             2) 리턴자료형 X,  생성자명 == 클래스명
 *             3) 매개변수가 없는 생성자 : 디폴트 생성자 
 *             4) 생성자는 인위적으로 호출 할 수 없다. 언제? 객체 생성할때 자동으로 호출된다. ( new Point
 *             5) 생성자의 역할: 필드를 초기화
 *             6) 생성자 오버로딩 가능.
 *             7) 생성자 상속되지 않는다. 
 *             8) 생성자가 하나도 존재하지 않을 경우 
 *                디폴트 생성자는 컴파일러가 컴파일 할때 추가함. 
 * 
 * 
 * 
 */
public class Ex04 {

	public int age = 20;  // 접근 지정자 기타제어자 자료형 필드명 [=초기값];


	public static void main(String[] args) {



		Point p1 = new Point(5,10);
		
//		p1.x = 1;
//		p1.y = 2;
		
		p1.dispPoint();
		p1.offsetPoint(50);
		p1.dispPoint();

		
		Point p2 = new Point(2,3);
		p2.dispPoint();
		                 
      // Point p3 = new Point (100,0);
		
//
//		Point p2 = new Point();
//		p2.x = 1;
//		p2.y = 1;


	}//main

} //class

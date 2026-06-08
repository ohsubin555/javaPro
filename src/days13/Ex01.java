package days13;

import days12.Point;

public class Ex01 {

	public static void main(String[] args) {
		
		/*1. this 키워드 
		 * ㄴ 현재 객체의 자기 자신을 가리키는 참조변수 
		 * ㄴ 스택      힙
		 *    []      [x][y]         [0x100번지]
		 *             0x100번지                  this
		 *             
		 * 2. this의 세가지 용도 
		 * 1. 멤버를 가리킬 때의 this 용도 
		 * 2. 생성자에서 또 다른 생성자를 호출 할 때의 this 용도  
		 * 3. 단독 (홀로) 사용될때에 this 용도 
		 * - 매개변수 : disPoint (this)
		 * -리턴 값: return this;
		 */
		
		
		Point p  = new Point(10); 
		p.dispPoint();  

	}//main

}//class

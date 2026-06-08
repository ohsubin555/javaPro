package days17;

import java.util.Stack;

/**
 * @author subin
 * @date 2026. 6. 4. 오후 5:18:37
 * @subject C->L : ArrayList, Vector, LinkedList 
 * 
 * @content C->S : HashSet, LinkedHashSet
 * 
 *  [Sta
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		Stack s = new Stack();
//	    s.add(s);
//	    s.addElement(s);      // 얘네 다 안됨
//	    s.addFirst(s);
		
		
		s.push("양인석");
		s.push("안정빈");
		s.push("신창만");
		s.push("이지훈");
		
		//s.get(2); //  LIFO 구조를 따르지 않기 때문에 사용  X 
        System.out.println(s.pop());// 가장 최신거 제거
        s.peek(); //읽기만 하고 제거는 하지 않음
        s.search("강민호"); // 트루 , 폴스 -> -1 or 윗치값
        s.isEmpty(); // 비었니
        
        System.out.println(s.isEmpty());
        while (!s.isEmpty()) {
        	System.out.println(s.pop());
			
		}
	}//main

}//class

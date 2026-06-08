package days18;

import java.util.LinkedHashSet;

/**
 * @author subin
 * @date 2026. 6. 5. 오전 9:14:33
 * @subject LinkedHashSet 컬렉션 클래스
 * @content 중복허용 X 순서유지 O 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		s.add(20);
		s.add(new Integer(10));
		s.add(20);
		s.add(15);

		System.out.println(s);//중복 허용하지 않음, 순서는 유지함. 
	}//main

}//class

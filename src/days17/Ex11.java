package days17;

import java.util.HashSet;

/**
 * @author subin
 * @date 2026. 6. 4. 오후 3:43:46
 * @subject C-> L : ArrayList Vector LinkedList
 * @content C -> S: HashSet 컬렉션 클래스 - 순서 유지 x , 중복허용 x
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // 16,0.75
		hs.add(9);
		hs.add(1);
		hs.add(15);

		System.out.println(hs); // 순서유지 안됨
		
		hs.add(1);
		
		System.out.println(hs); // 중복허용 안함
		
		hs.add(null);
		hs.add(null);
		hs.add(null);
        System.out.println(hs);
        
        hs.remove(9);
        System.out.println(hs);
        

	}//main

	
	
	
	
}//class

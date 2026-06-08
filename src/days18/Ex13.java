package days18;

import java.util.ArrayList;
import java.util.Collections;



/**
 * @author subin
 * @date 2026. 6. 5. 오후 3:12:36
 * @subject 배열기능 구현된 클래스: Arrays 클래스
 *          컬렉션 클래스 기능 구현된 클래스: Collections 클래스
 * @content 
 * 
 */
public class Ex13 {

	public static void main(String[] args) {
		ArrayList <Integer>list = new ArrayList <Integer>();  
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		//오른쪽으로 2칸식 회전(이동)
//		Collections.rotate(list, 2);
//		System.out.println(list);

		 // 0 2 바꾸기
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		//shake it
		Collections.shuffle(list);
		System.out.println(list);
		//오름차순
//		Collections.sort(list);
//		System.out.println(list);
		//내림차순 정렬
		Collections.reverse(list);
		System.out.println(list);
		//내림차순
		Collections.sort(list, (o1,o2)-> o1-o2);
		
		Collections.fill(list, 0);
		Collections.binarySearch(list, 100);
		Collections.replaceAll(list, 0, 100);
		
		
	}//main

}//class

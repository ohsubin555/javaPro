package days22.sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author subin
 * @date 2026. 6. 11. 오전 10:04:55
 * @subject 17.7 요소정렬
 *              ㄴ  요소를 오름차순 또는 내림차순으로 정렬하는 중간 처리 기능
 *              ㄴ sorted() 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("문규리", 10));
		list.add(new Student("조지훈", 20));
		
		// 점수로 오름차순 정렬을 해서 출력..
//		list.stream()   // Stream<Student>
//		    .sorted()   // implements Comparable<Student> 기본 정렬방식으로 
//		    .forEach(System.out::println);
		
		// 점수로 내림차순 정렬해서 출력
		list.stream()
//		   .sorted(new Comparator<Student>() {
//				@Override
//				public int compare(Student o1, Student o2) { 
//					return Integer.compare( o2.getScore(),  o1.getScore() );
//				}
//		    })
		
//		   .sorted(( o1,  o2) ->  Integer.compare( o2.getScore(),  o1.getScore() ) )
		
		   .sorted(Collections.reverseOrder())
		   
		   .forEach(System.out::println);

	} // main

} // class




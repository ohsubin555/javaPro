package days21.sec07;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author subin
 * @date 2026. 6. 10. 오전 11:06:22
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. 컬렉션, 배열에서 저장된 요소를 반복적으로 처리하기 위해서
		 *    Iterator, for문을 이용했다.
		 *    일괄적(표준화)으로 배열,컬렉션 반복적으로 요소를 처리하는 방법으로
		 *    jdk 1.8 스트림 ... 
		 * 2. 스트림: 흐르는 물, 
		 *         요소들이 하나씩 흘러가면서 처리된다.    
		 * */ 
		
		 Set<String> set = new HashSet<String>();
		 set.add("홍길동");
		 set.add("조지훈");
		 set.add("문규리");
		 
		 // [1]
//		 Iterator<String> ir = set.iterator();
//		 while (ir.hasNext()) {
//			String name = ir.next();
//			System.out.println( name );
//		 }
		 
		 // [2] 스트림을 사용해서 반복적으로 처리...
		 Stream<String> stream = set.stream();
		 // [1]
//		 stream.forEach( new Consumer<String>() { 
//			@Override
//			public void accept(String name) { 
//				System.out.println(name);
//			}
//		} );
		 // [2]
//		 stream.forEach( (name)->  System.out.println(name) );
//		 stream.forEach( name ->  System.out.println(name) );
		 // [3] 메소드 참조
		 //     클래스명::메소드명
		 //     객체명::메소드명
//		 stream.forEach( System.out::println );
		 
		 stream.forEach(name-> {
			 String threadName = Thread.currentThread().getName();
			 System.out.println( threadName + " : " +name);
		 });
		 
		 
		 
		 
		 

	} // 

}










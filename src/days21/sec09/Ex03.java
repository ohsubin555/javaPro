package days21.sec09;

import java.util.stream.IntStream;

/**
 * @author subin
 * @date 2026. 6. 10. 오후 12:17:26
 * @subject 
 * @content 숫자 범위 ->  스트림 
    IntStream 또는 LongStream의 정적 메소드인 
    range()와 
    rangeClosed() 메소드로 
    특정 범위의 정수 스트림을 얻을 수 있음
 * 
 */
public class Ex03 {
	
	static int sum = 0;	

	public static void main(String[] args) { 
		
		/*
		// IntStream.rangeClosed(1, 10)
		IntStream stream =  IntStream.range(1, 11);
		stream.forEach(System.out::println);
		
// Local variable sum defined in an enclosing scope must be final or effectively final		
		stream.forEach( n -> sum += n );
// java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println( "총합: " + sum );
		*/
		
		IntStream stream =  IntStream.range(1, 11);
		int total = stream.sum();
		System.out.println( total );
	}

}

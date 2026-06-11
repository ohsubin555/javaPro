package days22.Sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author subin
 * @date 2026. 6. 11. 오후 12:19:52
 * @subject 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		Random random = new Random();

		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<1000000000; i++) {  // 1억 번 반복
			scores.add(random.nextInt(101)); // 0~100 정수
		}

		// 스트림사용해서 평균 출력
		long start = System.nanoTime();
		double avg =  scores.stream()// Stream<Integer>
				//		      .mapToInt( i -> i.intValue() )  // IntStream
				.mapToInt( Integer::intValue )  // 메소드 참조
				.average()
				.getAsDouble();
		long end = System.nanoTime();
		long time = end - start; 
		// avg: 49.99662237, 일반 스트림 처리 시간: 72327200ns
		System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");


		// 스트림사용해서 평균 출력
		start = System.nanoTime();
		avg =  scores.parallelStream()// Stream<Integer>
				//				      .mapToInt( i -> i.intValue() )  // IntStream
				.mapToInt( Integer::intValue )  // 메소드 참조
				.average()
				.getAsDouble();
		end = System.nanoTime();
		time = end - start; 
		// avg: 49.99662237, 일반 스트림 처리 시간: 72327200ns
		System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
		
		
//		avg: 49.99620688, 일반 스트림 처리 시간: 74061100ns
//		avg: 49.99620688, 일반 스트림 처리 시간: 62854900ns
	} // main

} // class









package days05;

import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==1) { 
				System.out.printf("%d+",i);
				sum += i;


			}//if
		}//for

		System.out.printf("=%d",sum);
		 */


		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			if(i%2==0) continue;
			System.out.printf("%d+",i);
			sum += i;


		}//if

		System.out.printf("=%d\n",sum);

	}//for

}//m

/*int sum = IntStream.range(1, 10)
.filter(i -> i % 2 == 1)
.sum();

System.out.println(sum);
 */













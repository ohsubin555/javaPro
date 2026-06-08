package days05;

import java.util.stream.IntStream;

public class Ex02 {

	public static void main(String[] args) {

		/*
		int sum = 0;
		sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d+",i+1);
			sum += i+1;
		}
		System.out.printf("=%d\n",sum);
		 */


		/*int i = 10;
		int sum = 0;
		while (i>=1) {
			System.out.printf("%d+",i);
			sum += i;
			i--;
		}
		System.out.printf("=%d",sum);
		*/
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);








	}

}

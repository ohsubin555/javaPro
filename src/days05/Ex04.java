package days05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n;
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("정수를 입력하시오:");
		n = sc.nextInt();
		
	
		int sum = 0;
		sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d+",i+1);
			sum += i+1;
		}
		System.out.printf("=%d\n",sum);
		
		
		
		
		
	}

}

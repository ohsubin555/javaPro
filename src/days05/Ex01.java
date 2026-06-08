package days05;

import java.util.Scanner;

public class Ex01 {
	
	 /* 1. 정수(n)을 입력받아서 홀수/짝수 출력하는 코딩.
	 *   1) if문 사용해서 풀기
	 *   2) switch문 사용해서 풀기
	 */
	
	 public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("정수를 입력하시오:");
		n = sc.nextInt();
		
		if (n%2==0) { System.out.printf("%d는 짝수\n",n);
			
		}
		
		else {System.out.printf("d는 홀수\n",n);
			
		}
		
		System.out.println("END");
		
		 
				
				
		switch (n%2) { 
		case 0: System.out.println("짝수");
			
			break;

		default: System.out.println("홀수");
			break;
		}
		
	
		
		
		
		
		
		
		
	 }//main


}//class

package days04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {




		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해라");
		n= sc.nextInt();

		
		String result = switch (n%2) { 
		case 0 -> 	"짝수";
			
		default -> "홀수"; 
		};
		System.out.println("result  ");
	







	/*jdk 14이상에 있는 구문
		switch (n%2) {
		case 0 ->
		System.out.println("짝수");

		default ->
		System.out.println("홀수");
		\

		}

	\
       /* String result ;
		switch (n%2) { 
		case 0:
			result = "짝수";
			break;

		default:
			result = "홀수";
			break;
		}//swithch


		System.out.println("END");

		/*
		switch (n%2) { 
		case 0:
			System.out.println("짝수");
			break;

		default:
			System.out.println("홀수");
			break;
		}

		System.out.println("END");

	 */
}//main

}//class

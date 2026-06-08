package days04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex08_04 {

	public static void main(String[] args) {


		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해라");
		n= sc.nextInt();

		String result= "홀수";

		if (n%2==0)  
			result = "짝수";

		


		System.out.println(result);
	}//main

}//class

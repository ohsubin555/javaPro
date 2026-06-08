package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("n값을 입력하시오");
		n = Integer.parseInt(br.readLine());
		
		System.out.printf("n=%d\n",n);
		System.out.println("END");
		
	

	}//main

}//class

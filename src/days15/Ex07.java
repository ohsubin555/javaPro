package days15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) {
		// checked 예외 / unchecked 예외
		// 컴파일러가 예외처리 했는지 유무를 체크(확인)
		//  ㄴ RuntimeException 및 그 자식 예외 클래스들은
		// 컴파일러가 예외처리 유무를 확인하지 않는다. : unchecked  예외
		// ㄴ 그 외 모든 Exception 클래스들은 컴파일러가 예외처리를 유무를 확인한다. : chekced 예외

		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 String name = null;
		 
		 System.out.println("이름입력");
		 
		 try {
			 
			 name = br.readLine();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
         System.out.println("이름="+ name);
         
        
	}//main

}//class

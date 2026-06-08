package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author subin
 * @date 2026. 5. 13. 오후 2:47:16
 * @subject 키보드 (표준입력장치)로 부터 이름을 입력받아서 
 * @content name 문자열변수에 저장하고 출력
 *          System.in 사용.
 *    
 */

public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		
		// 1. br 객체 (물건)를 생성했다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
		String name ;
		
		
		System.out.print("> 이름을 입력하세요?");
		
		//Unhandled exception type IOException 예외 == 오류 == 에러 
		name = br.readLine();
		
		System.out.printf("%s\n", name);
		

	}//main

}//class

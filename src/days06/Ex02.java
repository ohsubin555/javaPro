package days06;

import java.util.Scanner;

/**
 * @author subin
 * @date 2026. 5. 18. 오전 10:49:29
 * @subject 
 * @content if 문 사용 
 *          국어 점수 입력 0 ~100 101엔터 -> '다시 입력하세요.' 반복. (유효성 검사)
 *          수/우/미/양/가 출력
 *           
 * 
 */
public class Ex02 {


	public static void main(String[] args) {


		int kor;
		Scanner scanner = new Scanner(System.in);
		
		boolean isValid = true;//true 유효, false 실패 
		
	
		
		do { System.out.print("국어 입력");
		kor = scanner.nextInt();
		
		if (!(kor >=0 && kor <=100)) 
		{System.out.println("0에서 100사이로 입력해주세요");
		isValid = false;
		}
		
		} while(!isValid);
		// kor <0 || kor >100
		
	      // 0<= kor <=100 -> 수~가
	      if ( 90 <= kor ) {  // 100
	         System.out.println("수");
	      }else if ( 80 <= kor ) {
	         System.out.println("우");
	      }else if ( 70 <= kor ) {
	         System.out.println("미");
	      }else if ( 60 <= kor ) {
	         System.out.println("양");
	      }else {
	    	  
	         System.out.println("가");
	      }
		

		//System.out.println("국어:" + kor);
        
		//0<= kor <=100. 수~가
				
	}//main

}//class

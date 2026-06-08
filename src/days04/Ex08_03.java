package days04;

import java.util.Scanner;

/**
 * @author subin
 * @date 2026. 5. 14. 오후 2:03:01
 * @subject 
 * @content 

/*          [제어문 종류]
 *          1. 조건문:  if문
 *          2. 분기문:  switch문
 *          3. 반복문:  for문 ,  확장for문( foreach문 )
 *          4. 조건반복문: while문,  do~while문
 */        // 5. 기타 : break문, continue 문

public class Ex08_03 {


	public static void main(String[] args) {
		
	
		// 자료형 변수명 [= 초기값];
	      int n;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("> n 정수 입력: ");
	      n = sc.nextInt(); 
	      // 11
	      if ( n % 2 == 0 ) {  // 짝수 조건식
	         System.out.printf("> n=%d (짝수) \n", n);
	      } // if 
	      
	      if ( n % 2 == 1 ) {  // 홀수 조건식
	         System.out.printf("> n=%d (홀수) \n", n);
	      } // if 
	      

	      System.out.println(" END ");
	}

}//class















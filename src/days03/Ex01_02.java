package days03;

import java.util.Calendar;

/**
 * @author subin
 * @date 2026. 5. 13. 오전 9:38:32
 * @subject 
 * @content 
 * 
 */

public class Ex01_02 {
			

	public static void main(String[] args) {  
		
		
		 /*
	       * %[argument_index$][flags][width][.precision]conversion
	       * %conversion
	       * %d
	       * %c
	       * %s
	       * %f
	       * %c
	       * %b
	       * */   
		
//      2진법: 0 1 
//      8진법: 0 1 2 3 4 5 6 7
//      10진법: 0 1 2 3 4 5 6 7 8 9
//      16진법: 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
		
		// 10 -> 12, a
		// 10 -> 00001010
      
		
		 Calendar c = Calendar.getInstance();
		 String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
		 System.out.println( s );
		   
		   
		System.out.println("-".repeat(50));
		
		 
		 String name = "오수빈";
		 short tot = 253;
		 double avg = 84.3333;
		 
		// System.out.printf("%s_%s_%s\n", name, name, name);
		// System.out.printf("%1$s_%1$s_%1$s\n", name);
	//	 System.out.printf("총점: [%10d]\n", tot);
		// System.out.printf("총점: [%-10d]\n", tot);
		 //                           % conversion 
		// System.out.printf("평균: [%10.2f]\n", avg);
		 int no = 10;
		// System.out.printf("방번호: [%04d]\n", no);
			     //괄호: 플래그
		// int n = -123;
		//  System.out.printf("n=%(d\n", n);
		 
		 // 정수 %d  10진수 출력  12
		 // 정수 %o  8진수 출력  012
		 // 정수 %x 16진수 출력   0x12
		 System.out.printf("방번호: [%d]\n", no); // 10
		 System.out.printf("방번호: [%#o]\n", no); // 12
		 System.out.printf("방번호: [%#x]\n", no); // a
		 System.out.printf("방번호: [%#X]\n", no); // A

		 
		    //         b
	      /*
	      byte b;
	      b = (byte) 130;      
	      System.out.println( b );
	      */ 
	      
	      // [][][][][1][0][1][0]  정수   -128~127
	      byte b = 10;
	      
	      // [][][][][1][0][1][0] [][][][][1][0][1][0]
	      //                   c
	      // 'A' -> 10진수 값 1:1 매칭 문자셋 -> 0 1
	      //                 65            -> 0000 0000 0100 0001 
	      char c1 = 'A';
	      char d = 65;
	      
	      
	      

	   } // main

	} // class
		 
		 

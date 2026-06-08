package days07;

public class Ex01_02 {

	public static void main(String[] args) {
		
		

	     System.out.println("[구구단 세로 출력]");
	      
	      for (int k = 1; k <= 3 ; k++) {
	         for (int i = 1; i <= 9 ; i++) {
	            for (int j = 3*k-1; j <= 3*k+1 && j <= 9 ; j++) {
	               System.out.printf("%d*%d=%d\t", j, i, i*j);
	            } // for j
	            System.out.println(); // 개행
	         } // for i
	         System.out.println(); // 개행
	      } // for k    
	      /*
	      for (int i = 1; i <= 9 ; i++) {
	         for (int j = 2; j <= 5 ; j++) {
	            System.out.printf("%d*%d=%d\t", j, i, i*j);
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      System.out.println(); // 개행
	      for (int i = 1; i <= 9 ; i++) {
	         for (int j = 6; j <= 9 ; j++) {
	            System.out.printf("%d*%d=%d\t", j, i, i*j);
	         } // for j
	         System.out.println(); // 개행
	      } // for i
	      */

	   } // main

	} // class

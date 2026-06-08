          package days06;

public class Ex08_02 {

	   public static void main(String[] args) {
		      /*
		      2*1=2
		      2*2
		      2*3
		      2*4
		      2*5
		      2*6
		      2*7
		      2*8
		      2*9=18
		      */
		     /* int dan = 2;
		      System.out.printf("[ %d]단\n", dan);
		      for (int i = 1; i <= 9 ; i++) {
		         System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		      }*/
		   
		      for (int i = 1; i <= 2 ; i++) {         
		         // System.out.printf("[ %d]단\n", dan); // 2~9 
		    	  
		          for (int dan = 2; dan <= 9; dan++) {
		             System.out.printf("%d*%d = %02d ", dan, i, dan * i);
		             System.out.println();
		          }
		          
		          //System.out.println();
		          
		          
		       }
		      

		   } // main

		} // class




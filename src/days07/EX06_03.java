package days07;

import java.util.Date;

public class EX06_03 {

	   public static void main(String[] args) {
	      Date d = new Date();
	      int currentYear = d.getYear()+1900 ;
	            
	      int count = currentYear/4 - currentYear/100 + currentYear/400;
	   }
}
	      /* [풀이 1]
	      int count = 0;
	      for (int i = 1; i <= currentYear ; i++) {
	         if( Ex06.isLeapYear(i) ) count++;
	      } // for i
	      System.out.println( count );
	      */
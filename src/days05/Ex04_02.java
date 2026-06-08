package days05;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n;  // int n, m;
		int m;
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("정수를 입력하시오:");
		n = sc.nextInt();
		System.out.print("정수를 입력하시오:");
		m = sc.nextInt();
		
	
		int sum = 0;
		
		
	    /*1  if (n > m) {
	          for (int i = m; i <= n; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ; 
	          } // for
	       } else {
	          for (int i = n; i <= m; i++) {  
	             System.out.printf("%d+", i );
	             sum += i ; 
	          } // for
	       }
		*/
		
	
			
		/*3	if (n>m) {
				int temp = n;
				n = m;
				m = temp;
				
				
				for (int i = n ; i <= m   ; i++  ) {
					System.out.printf("%d+",i);
					sum += i;
					
			}//f
			
			
		}//i
		System.out.printf("=%d\n",sum);
		*/
		
		int min = n>m ? m : n;
	    int max = Math.max(n, m);
		
		
		for (int i = n ; i <= m   ; i++  ) {
			System.out.printf("%d+",i);
			sum += i;
			
			
			
	}//f
	  
		
		System.out.printf("=%d\n",sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

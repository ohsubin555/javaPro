package days05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int com, user;
		Scanner scanner = new Scanner(System.in);
		com = (int)(Math.random()*3)+1;

		
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		 {
		
			 user = scanner.nextInt();
		switch (com - user) {
	      case 0:
	         System.out.println("무승부");
	         break;
	      case -1:
	         System.out.println("컴퓨터 승리");
	         break;
	      case 2:
	         System.out.println("컴퓨터 승리");
	         break;   
	      case 1:
	         System.out.println("사용자 승리");
	         break;   
	      case -2:
	         System.out.println("사용자 승리");
	         break;    
	         
	         
	         
	      
		}	
		
	}//m

	}//c
	
}

package days05;

public class Ex07_05 {

	// [] 인덱스 연산자 -> 배열 (array)

	public static void main(String[] args) { 
		/* 배열 정의? 1. 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것. 
		            2. 배열 선언 형식-> 자료형 [] 배열명= new 자료형 [배열크기];
		            3. 배열의 요소-
		            0번째 요소 names [0]
		            /1번째 요소 names [1]
		             .
		             .
		             .
		             10번째 요소  names [9]
		        
		 */
		
		 String [] names = new String[10];
		      
	      names[0]="양인석";
	      names[1]="안정빈";
	      names[2]="신창만";
	      names[3]="이지훈";
	      names[4]="장미성";
	      names[5]="류호훈";
	      names[6]="오수빈";
	      names[7]="이시연";
	      names[8]="조지훈";
	      names[9]="문규리";
	                                
	      System.out.println(names[0]);                
	      System.out.println(names[1]);
	      System.out.println(names[2]);
	      System.out.println(names[3]);
	      System.out.println(names[4]);
	      System.out.println(names[5]);
	      System.out.println(names[6]);
	      System.out.println(names[7]);
	      System.out.println(names[8]);
	      System.out.println(names[9]);
	   
	      
	      for (int i = 0; i <= 9; i++) {
			System.out.printf("%d",i);
		}
		/*
		String name1 = "양인석";
		String name2 = "안정빈";
		String name3 = "신창만";
		String name4 = "이지훈";
		String name5 = "장미성";
		String name6 = "류호훈";
		String name7 = "오수빈";
		String name8 = "이시연";
		String name9 = "조지훈";
		String name10 = "문규리";


		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
		System.out.println(name8);
		System.out.println(name9);
		System.out.println(name10);
		 */

	}//m

}//C

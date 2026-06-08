package days05;

public class Ex07_06 {

	public static void main(String[] args) {
		
		
		 // 1. 로또 배열 선언
	      int [] lottoNumbers = new int[6]; 
	      int lottoNumber;
	      
	      // 3. 로또 번호 6개를 발생시켜 각 0,1,2,3,4,5 요소에 저장
	      int index = 0;
	      boolean isFlag = false;
	      
	      while (index < lottoNumbers.length ) {
	    	 isFlag = false;
	         lottoNumber = (int)(Math.random() * 45) + 1;
	         System.out.println("> 중복체크 전 로또번호: " + lottoNumber);
	         // 4. 중복 체크해서 중복이 되면 isFlag= true, 중복이 되지 않으면 isFlag = false
	         //   반복문 for문
	         for (int i = 0; i <= index; i++) {
	            if( lottoNumbers[i] == lottoNumber ) {
	               isFlag = true;
	               break;
	            }
	         }
	         
	         if( !isFlag )   lottoNumbers[index++] = lottoNumber;
	         // index++;
	      } // while

	      // 2. 로또 배열 출력
	      for (int i = 0; i < lottoNumbers.length; i++) {
	         System.out.printf("[%d]", lottoNumbers[i]);
	      }
	      System.out.println(); // 개행
	   } // main

	} // class












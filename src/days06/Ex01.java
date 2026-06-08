package days06;

public class Ex01 {

	public static void main(String[] args) {

		
	      int [] lottoNumbers = new int[6];  
	      // 0: 아랫첨자값 LowerBound
	      // 5: 윗첨자값 UpperBound (lottoNumbers.length - 1)
	      int lottoNumber;
	      boolean isFlag = false;
	      int index = 0;
	 
	      
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

	      for (int i = 0; i < lottoNumbers.length; i++) {
		         System.out.printf("[%d]", lottoNumbers[i]);
			
		}
	      
	      
	}//main

}//class

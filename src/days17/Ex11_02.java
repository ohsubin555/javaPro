package days17;

import java.util.HashSet;

/**
 * @author subin
 * @date 2026. 6. 4. 오후 3:50:16
 * @subject 
 * @content 로또 게임 1) int [] lotto  int [][] lottos HashSet 사용
 * 
 */
public class Ex11_02 {


	public static void main(String[] args) {


		// 1. 로또 배열 선언
		
		HashSet lottoSet = new HashSet(6);
		createLottoNumbers(lottoSet);
		displayLottoNumbers(lottoSet);
		
	   }
	   
	// 한 게임 출력하는 메소드
	   public static void createLottoNumbers(HashSet lottoSet) {
		   int lottoNumber;

			while (lottoSet.size() < 6) {
			
				lottoNumber = (int)(Math.random() * 45) + 1;
				lottoSet.add(lottoNumber);
				
			} // while

			// 2. 로또 배열 출력
					// 개행
		} // main
		
		// HashSet  로또를 채우는 함수, 로또 번호 한 게임 발생..
		   public static void displayLottoNumbers (HashSet lottoSet) {
		      System.out.println(lottoSet);
    
		      } 
	     
	      
	   
	   

} // class







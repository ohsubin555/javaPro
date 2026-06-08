package days10;

import java.util.Scanner;


/**
 * @author subin
 * @date 2026. 5. 22. 오전 10:43:27
 * @subject 
 * @content 다차원 배열은 배열의 배열이다.
 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int LOTTO_PRICE = 1000; // 로또 1게임 천원
		int gameCount; // 게임횟수

		System.out.print(">게임 횟수 입력: ");
		gameCount = scanner.nextInt();
		
		int[][] lottoNumbers = new int[gameCount][6];
		
		displayLottoNumber (lottoNumbers);

		createLottoNumbers(lottoNumbers);



		
	}//main
    //1차원 배열 로또번호 한개를 발생시키는 함수
	public static void createLottoNumbers(int[][] lottoNumbers) {
		for (int i = 0; i < lottoNumbers.length; i++) {
			createLottoNumbers(lottoNumbers[i]);
			
		}
		// TODO Auto-generated method stub
		
	}
   // 한게임 출력하는 메소드 
	private static void displayLottoNumber(int[][] lottoNumbers) {
		for (int i = 0; i < lottoNumbers.length; i++) {
			displayLottoNumber(lottoNumbers[i]);
			
		}
		
	}
		private static void displayLottoNumber(int[] is) {
	// TODO Auto-generated method stub
	
}
		// TODO Auto-generated method stub
		
	public static void createLottoNumbers(int[] lottoNumbers) {


			int lottoNumber;


			int index = 0;
			boolean isFlag = false;

			while (index < lottoNumbers.length ) {
				isFlag = false;
				lottoNumber = (int)(Math.random() * 45) + 1;


				if(! isDuplicateLottoNumBer(lottoNumbers,lottoNumber,index))  

					lottoNumbers[index++] = lottoNumber;

			} // while


			for (int i = 0; i < lottoNumbers.length; i++) {
				System.out.printf("[%d]", lottoNumbers[i]);
			}
			System.out.println(); // 개행
		}
       // 한 게임 로또 번호 중복체크 
		public static boolean isDuplicateLottoNumBer(int[] lottoNumbers, int lottoNumber, int index) {
			boolean isFlag = false;
			for (int i = 0; i <= index; i++) {
				if( lottoNumbers[i] == lottoNumber ) {
					isFlag = true;
					break;
				}
			}
			// TODO Auto-generated method stub
			return false;
		}

		public static boolean isDuplicateLottoNumBer() {
			// TODO Auto-generated method stub
			return false;
		
	}//main

}//class

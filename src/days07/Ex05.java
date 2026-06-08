package days07;



/**
 * @author subin
 * @date 2026. 5. 19. 오후 2:29:16
 * @subject 메서드 + 제어문 + 배열
 * @content 로또 번호 발생시키는 코딩. days05.Ex07_06.java
 *           1) 로또번호를 발생시키는 함수 : createLottoNumbers()
 *           2) 중복 체크하는 함수       : isDuplicateLottoNumBer() 중복이되면  true 중복되지 않으면 false를 반환하는 메서드
 *           boolean isDuplicateLottoNumber()
 *           3) 로또번호 6개 -> 출력함수 : displayLottoNumber (lottoNumbers)
 */
public class Ex05 {

	public static void main(String[] args) {

		int [] lottoNumbers = new int[6]; 

		displayLottoNumber (lottoNumbers);

		createLottoNumbers(lottoNumbers);
	}

	private static void displayLottoNumber(int[] lottoNumbers) {
		// TODO Auto-generated method stub

	}

	private static void createLottoNumbers(int[] lottoNumbers) {


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

	private static boolean isDuplicateLottoNumBer(int[] lottoNumbers, int lottoNumber, int index) {
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
	}

}

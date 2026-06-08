package days14;

/**
 * @author subin
 * @date 2026. 5. 29. 오후 4:12:50
 * @subject [인터페이스 사용 장점]
 *          1. 개발시간을 단축
 * @content 2. 표준화 가능 
 *          3. 서로 관련 없는 클래스들에게 관계를 맺어줌
 *          4. 독립적인 프로그래밍이 가능 
 *       
 */
public class Ex09 {

	public static void main(String[] args) {

		int [] lottoArr = new int[ILotto.LENGTH];

		ILotto lottoGame = new 시연Lotto제품();

		lottoGame.dispLotto(lottoArr);
		lottoGame.fillLotto(lottoArr);
		
		System.out.println("END");
	}//main

}//class

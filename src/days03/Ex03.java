package days03;



/**
 * @author subin
 * @date 2026. 5. 13. 오후 12:39:49
 * @subject 
 * @content 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		double money = 1234567.9077;
		// 소수점 2자리에 출력
		// >money=1,234,567.91
		// System.out.printf(">money=%,.2f\n",money);
		
		String strMoney = String.format("%,.2f", money);
				System.out.println(strMoney);
	}//main

}//class

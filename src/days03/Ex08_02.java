package days03;

/**
 * @author subin
 * @date 2026. 5. 13. 오후 4:22:47
 * @subject 산술연산자 설명 - 5개
 * @content + - * / %
 * 
 */
public class Ex08_02 {
	
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 3;
		
	    System.out.println(i + j);
	    System.out.println(i - j);
	    System.out.println(i * j);
	    System.out.println(i / j); // 몫
	    System.out.println(i % j); // 나머지
	    
	    // System.out.println(10/0); //오류
	    System.out.println(10.0 / 0);// 실수를 나누면 무한대
	    System.out.println(10.0 % 0);// NAN= NOT A NUMBER
	    
	     
	}

}

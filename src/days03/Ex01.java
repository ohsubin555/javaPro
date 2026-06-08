package days03;

/**
 * @author subin
 * @date 2026. 5. 13. 오전 8:15:23
 * @subject 
 * @content 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
	     
		String name = "홍길동";
		byte kor = 90;
		byte eng = 87;
	    byte mat = 56;
	    short tot = (short)(kor+ eng + mat);
	    double aver = tot / 3d;
	    
	    System.out.printf("이름:\"%s\" \n국어:%d \n영어:%d \n수학:%d \n총점:%d \n평균:%.2f", name,kor, eng, mat, tot, aver);
	    
	    
	      
	    
	    
	    
	    
	    
	    
	}//main

}//class

/* [복습문제]
 * 1. 자바의 타입(Type, 자료형) 정리
 * 2. 이름, 국,영,수, 총점, 평균
 *    1) 각각의 변수 선언
 *    2)초기값 설정
 *    3)출력형식:
 *      이름: "홍길동"
 *      국어: 90
 *      영어: 87
 *      수학: 56 b       
 *      총점: ???
 *      평균: ??.??
 *      
 *      
 *      
 *      
 *      
 *      
 */
 

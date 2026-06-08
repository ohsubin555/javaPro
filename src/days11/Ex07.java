package days11;

/**
 * @author subin
 * @date 2026. 5. 26. 오후 3:08:13
 * @subject 
 * @content 클래스의 복사 
 *          클래스의 복제 - 얉은 복제/깊은 복제
 *            차이점 
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
	
		//  tv 객체 선언 및 생성 / 객체명. 필드명 / 객체명.메소드명() 
		Tv t1 = new Tv();
		t1. power();
		System.out.println(t1.channel);     //객체명. 필드명
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		
		System.out.println("end");
	}//main

}//class

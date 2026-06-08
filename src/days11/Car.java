package days11;

public class Car {
	
	//멤버== 클래스(객체)의 구성요소
	// ㄴ 멤버변수(필드 field) - 속성,특징
	String name;
	int speed;
	int weelCount;
	
	// ㄴ 멤버함수 (메서드 method) - 동작, 기능, 일
   public void dispCarInfo() {
	   System.out.printf("차이름; %s, 속도: %d", name,speed);
   }
}//class

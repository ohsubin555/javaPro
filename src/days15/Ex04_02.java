package days15;

import days14.Employee;

/**
 * @author subin
 * @date 2026. 6. 1. 오전 10:44:57
 * @subject 
 * @content  *  ***  4) 익명==무명(Anonymous) 클래스 
 *       - 클래스의 선언 + 객체 생성 합쳐진 이름없는 클래스 
 *       - 일회용.
 *       
 *       1) 이름이 없는 클래스. (일회용) 
 *       2) 클래스 선언 + new 연산자 객체 생성 
 *       3) 익명클래스 선언형식
 *       (1)  new 부모클래스명 (){
 *            //필드 선언  x
 *             //메소드 선언 x
 *             
 *             @Override 
 *             부모클래스의 메소드만 재정의 할 수 있다. 
 *       }
 *       (2)  new 인터페이스명 (){
 *            //필드 선언  x
 *             //메소드 선언 x
 *             
 *             @Override 
 *             부모클래스의 추상 메소드만 재정의 할 수 있다. 
 * */ 


public class Ex04_02 {

	public static void main(String[] args) {
		
		// Car,       Engine-> 상용화 테스트용도의 새로운 엔진 객체...
		Car testCar = new Car(new Engine() {
			
			@Override
			public void stop() {
				System.out.println("일회용 엔진의  stop()...");
			}
			
			@Override
			public void moreFuel(int fuel) {
				System.out.println("일회용 엔진의  moreFuel()...");
				
				
			}
			
			@Override
			public void lessFuel(int fuel) {
				System.out.println("일회용 엔진의  lessFuel()...");
				
			}
		});
		
		
   testCar.speedUP(100);
   testCar.stop();
   
   
   
   //추상클래스 이기 때문에 new 연산자로 객체 생성 불가
//   Employee emp = new Employee()
//
//   Employee emp = new Employee ("홍길동","주소","연락처","입사일자");
//   
//   public int get money() {
//	   
//   }
//   return 0;
//	}//m

}//c

}











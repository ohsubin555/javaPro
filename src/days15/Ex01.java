package days15;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 인터페이스(interface)
		 * 
		 * 1. 자바 자료형(Type) 
		 * ㄴ 기본형 8가지 
		 * ㄴ 참조형: 배열, 클래스(String) ,인터페이스 
		 * 
		 * 2. 일종의 추상 클래스이다. 
		 *    ㄴ 상수만 선언 가능 
		 *    ㄴ 100% 추상 메서드 선언 가능 
		 *    ㄴ jdk1.8 부터~ : static 메서드, defalut 메서드 추가. 
		 * 
		 * 3. 인터페이스는 그 자체만으로 사용되지 않고, 
		 * 다른 클래스를 선언하는데 도움을 줄 목적의 클래스. 
		 *
		 * 4.인터페이스 선언 형식
		 * [접근 지정자] interface 인터페이스 명 {
		 * }
		 * ㄴ 대문자로 시작 
		 * 5. 인터페이스끼리도 상속이 가능하다. 
		 */

	}//main

}//class

interface IA{
	public abstract void test1();
	void test2();
}

interface IB extends IA{
	//		public abstract void test1();
	//		void test2();
	void test3();

}

interface ID{
	public abstract void 
	test4();
	void test5();
}		
abstract class Test implements IB,ID{
	@Override
	public
	void test1() {
		System.out.println("추상 메서드를 오버라이딩...");
	}

}

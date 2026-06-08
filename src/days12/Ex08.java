package days12;

/**
 * @author subin
 * @date 2026. 5. 27. 오후 4:20:49
 * @subject [this 키워드 설명] 
 * @content 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {

		/*
		 * 1. this 정의
		 *   ㄴ  현재 객체 자기 자신을 가리키는 참조변수
		 *   
		 *   int i = 10;  // 참조변수
		 *   int [] m;    // 변수, 지역변수, 참조변수, 배열
		 *   Person p;    // 변수, 지역변수, 참조변수, 객체
		 * 2.  this의 용도 3가지
		 *   1) 멤버를 가리킬 때의 this  
		 * */


	

	Employee emp1 = new Employee();

	emp1.dispName();



	Employee emp2 = new Employee();

	emp2.setName("김길동");

	emp2.dispName();



}
}

class Employee

{
	private String name;

	public void setName(String name) {
		this.name = name;

	}
	public String getName() {
		return this.name;
	}
	public void dispName() {
		System.out.println(this.name);
	}




}

package days12;

/**
 * @author subin
 * @date 2026. 5. 27. 오후 3:35:12
 * @subject getter & setter 
 * @content Person 클래스 
 * 
 */
public class Ex07 {
	

	public static void main(String[] args) {
		Person p1 = new Person ();
		//p1.name = "홍길동";
		
// he field Person.age is not visible -> 접근지정자 때문
		
		p1.setAge(20); 
		
		System.out.println(p1.getAge());

		//p1.dispPerson();


	}//main

}//class

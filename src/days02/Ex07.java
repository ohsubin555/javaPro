package days02;

public class Ex07 {

	public static void main(String[] args) {
		// 
		
		String name = "홍길동";
		byte age = 23;
		// 학점: A B C D F
		//자료형 변수명 = A; 
	char grade = 'A';
	//성별을 저장하는 변수를 선언
	// Type mismatch: cannot convert from char to String
	//	String gender = "여자";
// char gender = 'F'// 'M'
		boolean gender = true; // false;
	// 출력형식: 이름은 "이창익"이고, 나이는 '20'살이고, 학점은 'D'이고, 성별은 true입니다.
  System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'이고, 성별은 %b입니다.",
		  name, age, grade, gender);
 

 
 
	}

}

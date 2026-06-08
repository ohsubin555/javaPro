package days14;


/**
 * @author subin
 * @date 2026. 5. 29. 오전 10:04:47
 * @subject 
 * @content 
 * 1. 사원 클래스 (Employee) : 사원이라면 공통으로 가지고 있는 멤버들을 구현한 클래스 
 * 2. 정규직 클래스 (Regular)
 * 3. 영업직 클래스 (SalesMan)
 * 4. 임시직 클래스 (Temp)
 * [ 상속 계층도 ]
      
               Object            모든 클래스의 최상위 부모 클래스이다. 
                 ↑                
                Employee           
          ↑                  ↑
        Regular             Temp
          ↑
       SalesMan
       
       1. 상속성 정리
       2. 다형성 / 인터페이스
       3. 업캐스팅/ 다운캐스팅
       4. 오버로딩/ 오버라이딩    중복함수 / 재정의 함수
       5. 추상화(추상메소드, 추상클래스)
       6. this, super 키워드 설명
       7. final 키워드 설명.
       등등
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		// 1. Employee emp1 
		 Employee emp1  =new Employee("오수빈","서울 강남구","010-1234-5678","2026-10-25");
		 emp1.dispEmpInfo();
		*/
		/*
       //2. Regular emp2;
       /// 
       /// UpCasting (자동 업캐스팅)
       /// 상속 ( is - a ) 관계 - 정규직은 사원이다.
       /// 
		Regular emp2 = new Regular ("이시연","서울 영등포","010-4324-6478","2026-10-25", 3000000);
		emp2.dispEmpInfo();
		// 문제점 : emp1.getPay();
		///       E
		/// [n][a][t][h] <p> [super][this] 
		/// 
		  	emp1.disE
		/// 
		
	
		*/
//		
//		Employee emp1 = new Regular ("이시연","서울 영등포","010-4324-6478","2026-10-25", 3000000);
//	    emp1.dispEmpInfo ();  // 그러나 실제 자식객체 dispEmpInfo() 메소드가 호출 되더라
//	    
//	    
//	    Regular emp2 = (Regular) emp1; //다운캐스팅 
//	    emp2.getPay();
		
//	Point p = new Employee -> 에러

		
		
	}//m

}//c

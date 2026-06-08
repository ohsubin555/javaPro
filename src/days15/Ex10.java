package days15;

/**
 * @author subin
 * @date 2026. 6. 1. 오후 4:15:15
 * @subject Object 클래스
 *           ㄴ 모든 클래스의 최상위 부모 클래ㅐㅐㅐㅐㅐㅐㅐㅐㅐㅐ스
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
/*
		Data v1 =new Data (10);
		int hashCode = v1.hashCode();
		System.out.println(hashCode);

		Data v2 =new Data (10);
		hashCode = v2.hashCode();
		System.out.println(hashCode);

		Data v3 = v2;
		hashCode = v3.hashCode();
		System.out.println(hashCode);
		
		
		// v1 객체의 클래스 정보를 반환하는 메서드 :
		
	   Class classInfo = v1.getClass(); 
	   System.out.println(classInfo.getName());//패키지명 + 클래스명 = FullName
	   
	   System.out.println(v1.toString());//객체의 정보를 출력하는 메소드 days15.Data @ 54bedef2 // FULLNAME + @ + HASHCODE 16진수의 값
	   
	   	*/
	
	   	Data v1 =new Data (10);
		
		Data v2 =new Data (10);
		
		System.out.println(v1==v2);
		//equals () 메소드 Object 로 부터 상속 받아서 오버라이딩. (재정의)
		//                 value 속성값이 같으면 true 를 반환하도록 재정의 
		
		
		System.out.println(v1.equals(v2));
		
		// Object.clone() 복제 메서드 
		
	
	}//main

}//class


class Data extends Object{
	int value;

	public Data(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Data ) {			 
			Data d = (Data) obj;			
			return this.value == d.value;			
		}
		return false;
	}

	@Override
	public String toString() {
		return "Data [value=" + value + "]";
	}

//	@Override
//	public String toString() {
//		
//		return Data (value = + value + ());
//	}
//	
	
	
	
	
	
}

	




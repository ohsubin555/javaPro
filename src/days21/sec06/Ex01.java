package days21.sec06;

/**
 * @author subin
 * @date 2026. 6. 10. 오전 10:32:55
 * @subject 메소드 참조
 * @content 생성자 참조
 *             ㄴ 생성자 참조하는 의미는 객체를 생성하는 의미이고
 *             ㄴ 람다식이 단순히 객체를 생성하고 리턴한다면
 *                -> 생성자 참조로 대치할 수 있다. 
 *             ㄴ 예) (a,b) -> { return new 클래스명(a,b); }
 *                    클래스명::new   
 * 
 */
public class Ex01 {

	public static void main(String[] args) {

		Person p = new Person();
		// [1]
//		Member m2 = p.getMember2(new Creatable2() {			
//			@Override
//			public Member create(String id, String name) {				
//				return new Member(id, name);
//			}
//		});		
		// [2]
//		Member m2 = p.getMember2((id, name)-> new Member(id, name)	 );
		// [3]
		Member m2 = p.getMember2( Member::new );
		System.out.println( m2 );
		/*
		// [1]
//		Member m1 = p.getMember1((id)-> {
//			return new Member(id);
//		});
		// [2]
//		Member m1 = p.getMember1((id)-> new Member(id) );
		// [3] 생성자 참조
		Member m1 = p.getMember1( Member::new  );		
		
		System.out.println( m1 );
	   */
		

	} // main

} // class







package days21.sec06;

public class Person {
	
	public Member getMember1(Creatable creatable) {
	Member member=creatable.create("admin");
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		Member member=creatable.create("hong","홍길동");
		return member;
	}

}

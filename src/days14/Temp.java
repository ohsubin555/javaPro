package days14;


//임시직 사원 클래스

public class Temp extends Employee {


	// 필드 : name, addr, tel, hiredate
	private int days; // 근무일수
	private int payOfDay; //하루일당

	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}

	public Temp(String name, String addr, String tel, String hiredate, 
			int days, int payOfDay) {
		super(name, addr, tel, hiredate);

		this.days = days;
		this.payOfDay = payOfDay;

		System.out.println("Temp 6 생성자 호출");
	}



	public Temp(String string, String string2, String string3, String string4, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispEmpInfo() {

		super.dispEmpInfo();

		System.out.printf("근무일: %d, 일당: %d\n", this.days,this.payOfDay);

	}
	
	@Override
	// 급여 계산해서 반환하는 메서드 
	public int getPay() {
		return this.days*this.payOfDay;
	}

}//class




package days13;



/**
 * @author subin
 * @date 2026. 5. 28. 오전 10:43:12
 * @subject 정적 멤버 = 정적 필드 + 정적 메소드 
 * @content              static  static
 *              static {
 *              }
 */
public class Ex02 {

	public static void main(String[] args) {
		
		//클래스명.필드, 메서드명()
		//The field Save.rate is not visible
		//Save.rate = 0.04;
		Save.setRate(0.04);
		
		
		Save s1 = new Save("양인석",10000,0.04);
		Save s2 = new Save("양정빈",1500000,0.04);
		Save s3 = new Save("신창만",56000,0.04);
		
		s1.setRate(0.77);
		
		
		System.out.println(s1.getRate());
		System.out.println(s2.getRate());
		System.out.println(s3.getRate());
		
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		
		

	}//main

}//class


//저축클래스 
class Save {

	private String name; //예금주
	private int money; //예금액
	
	
	//클래스 변수 , 정적 (static) 변수(field), 공유변수
	private static double rate=0.01; //이자율

    static {
    	rate =0.04;
    }
	public Save() {

	}

	public Save(String name, int money, double rate) {
		//super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	
	
	

	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
		
		
	}
	
	
	



	

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//정적 메소드 - static field를 접근하기 위함. 
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	
	
	
}

















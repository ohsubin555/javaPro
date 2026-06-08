package days13;

import java.util.Date;

public class Ex08_02 {

	public static void main(String[] args) {
		MyDate d = new MyDate();
		System.out.println(d.toLocaleString());
		
		d.printDate();
		
		
	}//m

}//c
class MyDate extends Date {
	//f
	
	//p
	
	//m
	public void printDate() {
		System.out.println(this); //new MyDate();
	}
}
package days09;

import java.util.Date;

public class Ex03_02 {

	public static void main(String[] args) {
		
		
		String rrn = "830412-2700001";
		int age = getCountingAge(rrn); 
		System.out.println(age);
	    age = getAemericanAge(rrn); 
		System.out.println(age);

	}

	public static int getAemericanAge(String rrn) {
		int aemericanAge = getCountingAge(rrn)-1;
		Date d = new Date();
		int cMonth = d.getMonth() + 1;
		int cDay = d.getDate();		
		int bMonth = Integer.parseInt(rrn.substring(2,4));
		int bDay = Integer.parseInt(rrn.substring(4,6));
		
		if (bMonth>cMonth || bMonth==cMonth && bDay>cDay) {
			
			aemericanAge--;
		}
		
		
		return aemericanAge;
	}

	public static int getCountingAge(String rrn) {
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		String birhtday = Ex03.getBirthday(rrn);
		int birthYear = Integer.parseInt(birhtday.substring(0,4));
		return currentYear-birthYear +1 ;
	} 

}

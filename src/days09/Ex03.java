package days09;

import java.util.BitSet;

public class Ex03 {

	public static void main(String[] args) {

		String rrn = "830412-2700001";

		// 1. 생년월일 "1983년 4월 12일"

		String birthday = getBirthday(rrn); 
		System.out.println(birthday);

	}//main
	//1 1900년대 남자 2 1900년대 여자
	// 3 2000 남 4 2000 여
	//5 1900 외남 6 1900 외여
	//7 2000 외남 8 2000 외여
	//9 1800 남 0 1800 여

	private static int getCentry(String rrn) {
		
		int centry = switch ( rrn.charAt(7)) {
		          case '1','2','5','6' -> 1900;
		          case '3','4','7','8' -> 2000;
	              default -> 1800;
		};
	

		switch ( rrn.charAt(7) - '0' ) {    // 2
		case 1: case 2: case 5: case 6:
			centry = 1900;
			break;
		case 3: case 4: case 7: case 8:
			centry = 2000;
			break;
		default:
			centry = 1800;
			break;
		}
		
		
		return centry;
		

	}
	

	static String getBirthday(String rrn) {
		//rrn = 830412-2700001
		int centry = getCentry(rrn);

		int year = centry + Integer.parseInt(rrn.substring(0,2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day =Integer.parseInt(rrn.substring(4,6));
	

		return String.format("%d년 %d월 %d일", year,month,day);
	}

}//class

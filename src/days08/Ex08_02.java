package days08;

public class Ex08_02 {

	public static void main(String[] args) {

		String rrn = "830412-1700001";
		boolean gender = getRRNGender(rrn);

		System.out.println(gender ? "남자" : "여자");
	}//main

	private static boolean getRRNGender(String rrn) {
		
		
       return rrn.charAt(7) % 2==0 ? false : true;
		
	}

}//class

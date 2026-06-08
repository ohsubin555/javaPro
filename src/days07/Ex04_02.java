package days07;

import java.util.Arrays;

public class Ex04_02 {

	




	/*
		String a = "한aB7cDe";

		String u = myToUppercase(a);
		//String u = a.toUpperCase();
		System.out.println(u);


		String l = a.toLowerCase();
		System.out.println(l);
        String upper = "";
	 */




	public static String myToUpperCase(String s) {
		
		String a = "한aB7cDe";
		char [] sArr = s.toCharArray();
		System.out.println(Arrays.toString(sArr));
		String upper = "";
		char ch;
		for (int i = 0; i < sArr.length; i++) {
			ch =sArr[i];
			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} 
			upper += ch;

		}

		return upper;
	}





}//main  
/*
	//대문자로 변환해서 반환하는 기능을 하는 메소드 선언'
	public static String myToUppercase(String s) {
		// System.out.println(s.length() ); 7
		String upper = null;
		char ch;
		for (int i = 0; i < s.length(); i++) {
			System.out.printf("\'%c'\n", s.charAt(i));
		ch = s.charAt(i);

		if ('a' <= ch && ch <= 'z') {
			ch = (char) (ch - 32);
			System.out.println(ch);

		}
		upper += ch;

		}
		return upper;
	}

}//class

 */

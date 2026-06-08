package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subin
 * @date 2026. 6. 2. 오후 2:09:08
 * @subject 
 * @content 정규표현식 ([Reg]ular [Ex]pression)] regex
 *          ㄴ 문자열 속에 원하는 패턴과 일치하는 문자열 찾기
 *          미리 정의된 기호와 식 \\s [A-Z] * + ? 등등
 *          java.util.regex  패키지 
 *          ㄴ Pattern 클래스 - 정규식을 정의
 *          ㄴ Matcher 클래스 - 데이터와 정규식 (pattren 객체를 비교)
 * 
 */
public class Ex09 {

	private static String regex;

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c"};

		//	String regex = "c[a-z]*";
		//	String regex = "c[a-z]"; // 문자 두개짜리 co ca
		//	String regex = "c[a-zA-Z0-9]"; // cA C0 
		//	String regex = "c\\w"; // \w == [a-zA-Z0-9]  \W == [^a-zA-Z0-9]       ^는 부정을 나타냄
		
	      // String regex = ".*"; // 
	      // String regex = "c."; // 두글자, c 다음 어떤 문자열도 ㅏ가능
	      // String regex = "c\\.";
	      // String regex = "c[0-9]";
	      // String regex = "c.*t";
	      // String regex = "[b|c]";
	      // String regex = "[bc]";
	      // String regex = "[b-c].*";
	      // String regex = "[^bc].*";
	      // String regex = ".*a.*";
	      // String regex = "[^bcd].*";

	      // String regex = "[a-zA-Z].*";
	      // String regex = "[ae-zA-Z].*";
	      // String regex = "[a-zA-Z&&[^b-d]].*"; // 알파벳을 시작 (소문자  bcd 가 아님) 아무 문자 0개 이상
		
//      String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";

		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < data.length; i++) {

			Matcher matcher = pattern.matcher(data[i]);
			if (matcher.matches()) {
				System.out.println(data[i]);
			}

		}

		//		for (int i = 0; i < data.length; i++) {
		//			if(data[i].matches(regex)) { //string.mathces (String regex) 사용 코딩
		//				System.out.println(data[i]);
		//			}
		//		}
	}

}

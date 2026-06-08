package days14;

import java.util.Arrays;

public class Ex01 {
	
//  10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
  String n = "keNik";    //  [][][][][]
  String m= "kKnie";     //  [][][][][]

	public static void main(String[] args) {


		   String n = "keNik";
	        String m = "kKnie";

	        // 1. 소문자 통일
	        n = n.toLowerCase();
	        m = m.toLowerCase();

	        // 2. char 배열로 변환
	        char[] arrN = n.toCharArray();
	        char[] arrM = m.toCharArray();
	        
	        
	        
	        
//	        // 3. 문자열 변환 char[] -> String
//	        n = new String( nArr );
//	        m = new String( mArr );
//	        

	        // 3. 정렬
	        Arrays.sort(arrN);
	        Arrays.sort(arrM);

	        // 4. 비교
	        if (Arrays.equals(arrN, arrM)) {
	            System.out.println("같은 문자 구성");
	        } else {
	            System.out.println("다름");
	        }
	    }
	}
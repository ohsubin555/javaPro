package days09;

/**
 * @author subin
 * @date 2026. 5. 21. 오전 9:38:47
 * @subject 0<=~<=300 체크하는 정규표현식 연습
 * @content 
 * 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		int [] m = { 3,5,99,120,299,300,-12,003,999};
		for (int i = 0; i < m.length; i++) {
			
			int tot; 
			String sTOt = m[i]+"";
			String sTot = "300";
			//String regex = "^\\d{3}$";
			String regex = "^(300|[1-9]\\d|[12]\\d{2})";
			
			if (sTot.matches(regex)) {
				tot = Integer.parseInt(sTot);
				System.out.println(tot);
				
			} else { System.out.println("잘못됨");
				
			}
		}//


	}//main

}//class

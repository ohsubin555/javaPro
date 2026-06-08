package days07;

public class Ex02_03 {

	public static void main(String[] args) {

		String inputValue = "홍길동,23,45,56,167";
		String [] dataArr = inputValue.split(",",3);
		
		//[2] foreach문,순서보장안됨
		
		for (String s : dataArr) {
			System.out.println(s);
			
		}
		
		
		
		
		/*	[1] for (int i = 0; i < dataArr.length; i++) {
			System.out.printf("dataArr[%d]=%s\n",i,dataArr[i]);
		 */
		
		
		
		
		
		
		

	}//m
}//c



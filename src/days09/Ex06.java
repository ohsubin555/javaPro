package days09;

/**
 * @author subin
 * @date 2026. 5. 21. 오후 3:07:00
 * @subject 다차원배열: 2차원 이상의 배열 
 * @content ㄴ 1차원,2차원,3차원 배열...
 * 
 */
public class Ex06 {

	public static void main(String[] args) {

		/* 1차원 배열
	      // int [] m = new int[8];
	      /// 1차원배열의 초기화
	      int [] m = {1,2,3,4,5,6,7,8};
	      System.out.println( m.length ); // 배열크기 8
	      for (int i = 0; i < m.length; i++) {
	         System.out.printf("m[%d]", i);
	      }
	      System.out.println();
		 */


		// ****
		// ****
		// ****
		// ****

//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("****");
//		}		      
//		i=1  j=1,2,3,4       
//				i=2  j=1,2,3,4
//				i=3  j=1,2,3,4
//				i=4  j=1,2,3,4
				for (int i = 1; i <= 10; i++) {       // 행갯수   
					for (int j = 1; j <= 5; j++) {  // 열갯수
						System.out.print("*");
					} 
					System.out.println();         
				}

	


}//main

}//class

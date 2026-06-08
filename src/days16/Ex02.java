package days16;

/**
 * @author subin
 * @date 2026. 6. 2. 오전 10:36:59
 * @subject 
 * @content  2. StringBuffer 클래스  //멀티 스레드에 안전하다(==동기화 처리가 되어져 있다.)
             3. StringBuilder 클래스 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {

		//testStringAppend();
		// System.out.println("end");
		//testStringBuilderAppend();
		//수정,삭제,삽입

		StringBuilder sb = new StringBuilder("public static void main(String[] args) {");
		sb.append("끝에 문자열 연결");
		sb.delete(1, 5);
		sb.replace(0, 2, "바꿈");
		sb.insert(1, "삽입");
		System.out.println(sb.toString());
	    sb.reverse();
		
		// String: 수정, 삭제, 삽입  X
		//      String s = "TODO Auto-generated method stub";
		//      int index = s.indexOf("generated");
		//      
		//      System.out.println( s.substring(0, index + "generated".length()) + " 삽입" + s.substring(index + "generated".length()) );


	}//main



	public static void testStringBuilderAppend() {

		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			sb.append("a");
		}

		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");

	}

	//
	//	
	//	public static void testStringAppend() {
	//		
	//	    long start = System.nanoTime();
	//	      
	//	      String s = "a";
	//	      for (int i = 0; i < 2000000; i++) {
	//	         s += "a";
	//	      }
	//	      
	//	      long end = System.nanoTime();
	//	      System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	//		
	//	}
	//	
}//class




























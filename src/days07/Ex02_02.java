package days07;

public class Ex02_02 {

	public static void main(String[] args) {

		System.out.println( Integer.toBinaryString(10) ); // String "1010"
		System.out.println( Integer.toOctalString(10) );
		System.out.println( Integer.toHexString(10) );

		System.out.println( Integer.MAX_VALUE);

		int z = Integer.parseInt("100");

		//		      int x = 2147483647;
		int x = Integer.MAX_VALUE;

		int y = x + 100;
		//		      long y = x + 100;

		System.out.println( y );  // -2147483549



	} // main

} // class





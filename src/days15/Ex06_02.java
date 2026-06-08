package days15;

import java.util.Arrays;
import java.util.Random;

public class Ex06_02 {

	public static void main(String[] args) {


		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;

		int [] m = new int [5];

		for (int i = 0; i < 10 ; i++) {
			try {
				n = rnd.nextInt(5);  

				result = number / n ;
				m[i] = result;
				System.out.println(result );

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 m이 다 채워짐");
				//break;
				
				m = Arrays.copyOf(m, m.length+5);
			} catch (ArithmeticException e) {
				i--;
			}
			catch (Exception e) {  //다중캐치문

			}



		} // for


	}//main

}//class

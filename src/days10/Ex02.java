package days10;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {


		int [] m =	new Random().ints(1,100).limit(5).toArray();
		System.out.println(m.length);
		System.out.println(Arrays.toString(m));

		int index = m.length;

		if (index >= m.length) {

			int[] temp = new int [m.length+3];

			/*// m배열을  temp 라는 배열에 복사하는 코딩
			for (int i = 0; i < m.length; i++) {

				temp[i] = m[i];

			 */
			
			// System.arraycopy(m, 0, temp, 0, m.length);
			 //  Arrays.copyOf( )***
		
			m = temp;
		}
		 
	

	//m[index] = 100;
	System.out.println(Arrays.toString(m));
}

}

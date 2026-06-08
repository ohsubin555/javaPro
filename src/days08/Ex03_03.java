package days08;

public class Ex03_03 {

	public static void main(String[] args) {
		/*
		 * [문제] 거듭제곱 ==멱
		 * 밑수를 지수만큼 반복해서 곱하는 수 
		 * 
		 * power (base, exponent)
		 * recursivePower(base,exponent)
		 */

		System.out.println(power(2,3));
		System.out.println( recursivePower(2,3));




	}

	private static int power(int base, int exponent) {

		int sum = 1;
		for (int i = 0; i < exponent; i++) {
			sum = sum*base;
		}
		return sum;
	}

	public static int recursivePower(int base, int exponent) {

		if(exponent == 0) {

			recursivePower(base, exponent - 1);
		}


		return 0;
	}


}

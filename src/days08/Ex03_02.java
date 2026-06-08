package days08;

public class Ex03_02 {

	private static int m;


	public static void main(String[] args) {


		// 1~n 까지 합을 반환하는 메서드 : sum
		
		// factorial  ==계승
		// n!
		// 5! = 5*4*3*2*1
		// 0! == 1
		
		System.out.println(sum(10));
		System.out.println(recursiveSum(10));
		System.out.println(factorial(5));
		System.out.println(recursivefactorial(5));


	}//main

	private static int recursivefactorial(int n) {
		if (n==0 || n==1) return 1;
		else              return n*recursiveSum(n-1);
		
	}
		
	
		
	

	private static int factorial(int n) {
		int result = 1;
		for (int i = n; i >=1; i--) {
			result *= i;
			
		}
	
		return result;
	}

	public static int sum(int n){
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;

	} 


	public static int recursiveSum(int n){

		if (n==1) return 1;
		else      return n + recursiveSum(n-1);
		



		
	}


}//class

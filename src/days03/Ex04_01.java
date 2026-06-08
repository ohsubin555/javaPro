package days03;

public class Ex04_01 {
	

	public static void main(String [] args) {
		
		char upperCase = 'X';
		//Type mismatch: cannot convert from int to char
		char lowerCase = (char) (upperCase + 32);
		
		System.out.printf("%c -> %c\n", upperCase, lowerCase);
		
		
		
	}//main

}//class

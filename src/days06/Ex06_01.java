package days06;

import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);

		for (int i = 0, lineNumber =1; i < 256; i++) {

			if (i%10==0) 
			{
				System.out.printf("%d번째:",lineNumber);
			}
			
			System.out.printf("\'%c\'(%d)",(char) i, i);

			if ( i%10==9){
				System.out.println();
				
				// 라인 10개 출력 ?
				if(lineNumber %10 ==0) {
					System.out.print("엔터를 치시오");
					scanner.nextLine();
				}
				
				lineNumber++;
			} 

		} // for


	}

}

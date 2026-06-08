package days06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 한 라인에 10개의 아스키 출력
		Scanner scanner = new Scanner(System.in);
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i%10==0) {
				System.out.printf("%d:",lineNumber);
			}
			System.out.printf("\'%c\' (%d)", (char)i,i);
			if(i%10==9) {

				System.out.println();

				if (lineNumber%10==0) {
					System.out.println("\t 계속하려면 엔터치세요");
				                       scanner.nextLine();

				}

				
				lineNumber++;
			}
		}



		//System.out.println();

	}

}

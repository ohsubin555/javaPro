package days07;

import java.util.Scanner;

/**
 * @author subin
 * @date 2026. 5. 19. 오후 3:05:14
 * @subject 메소드 선언 + 제어문 연습
 * @content 연도를 입력받아서 윤년/평년 출력 코딩. 
 *           ㄴ 윤년? 평년? 
 *           1년: 지구- 태양 1바퀴 (공전) - 365.2422일
 *           율리우스력: 365.25
 *           그레고리력: 365.  400년 -> 97일 남음
 *           치윤법 - 4의 배수: 윤년 100일 
 *                - 100의 배수년: -4일
 *                - 400의 배수년 : 1일 
 *           1) 연도를 입력받아서 반환하는 메서드: int getYear()
 *           2) 윤년/평년 체크하는 메서드      : boolean isLeapYear(입력받은년도) 
 *           
 */
public class Ex06 {

	public static void main(String[] args) {
		int year = getYear();

		boolean isLeapYear = false;

		if (isLeapYear) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}

	}

	private static int getYear() {
		//유효한 연도는 1이상의 정수 
		Scanner scanner = new Scanner(System.in);
		int year;
		String sYear;
		do {System.out.print("연도 입력: ");
		sYear = scanner.next();

		} while (!sYear.matches("^[1-9][0-9]*$"));
		
		year = Integer.parseInt(sYear);
		
		return year;
	
	}//main

	public static boolean isLeapYear(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}//class

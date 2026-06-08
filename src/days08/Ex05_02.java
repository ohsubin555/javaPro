package days08;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2026. 5. 20. 오전 11:48:30
 * @subject 배열 + 제어문 
 * @content  ㄴ 한 학생의 [이름, 국,영,수], 총, 평 출력.
 *           ㄴ 한 반에 30명의 학생들의 + 등수 입력, 출력.
 *           
 *           메소드 작성.
 *             ㄴ 등수 처리
 */
public class Ex05_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int STUDENT_COUNT = 30;


		int index = 0;
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];

		String name;
		int kor, eng, mat, tot;
		double avg;

		index = inputStudentInfo(names, kors, engs, mats, tots, avgs, index, scanner);

		// 등수처리  Call By Reference   Call By Value
		processStudentRank(tots, ranks, index);

		// 학생들 성적 정보 출력
		// index: 입력받은 학생수 -> count
		printStudentInfo(names, kors, engs, mats, tots, avgs, ranks, index);



	} // main

	private static int inputStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int index, Scanner scanner) {
		String name;
		int kor, eng, mat, tot;
		double avg;

		char con = 'y';

		do {
			System.out.printf("%d번 이름 국어 영어 수학 입력: ", index + 1 );
			name = generateRandomName() ; //scanner.next();   
			kor = generateRandomScore(); // scanner.nextInt();
			eng = generateRandomScore(); //scanner.nextInt();
			mat = generateRandomScore(); //scanner.nextInt();
			//
			tot = kor + eng + mat;
			avg = (double)tot/3;

			names[index] = name;   
			kors[index] = kor;
			engs[index] = eng;
			mats[index] = mat;
			tots[index] = tot;
			avgs[index] = avg;

			index++;

			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 

		return index;
	}

	private static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int index)  {
		System.out.printf("\n 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf(
					"> %d번 이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f, 등수:%d\n"
					, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}

	}

	public static String generateRandomName() {
		// '가' 44032 ~ '힣' 55203
		char [] nameArr = new char[3];

		// String -> char[] 변환
		Random rnd = new Random();
		char nameChar;
		for (int i = 0; i < nameArr.length; i++) {
			nameChar = (char) rnd.nextInt('가', '힣');
			nameArr[i] = nameChar;
		}

		// char [] -> String 변환
		//       String name = new String( nameArr );
		String name = String.valueOf(nameArr);

		return name;
	}

	public static int generateRandomScore() {
		Random rnd = new Random();
		int score = rnd.nextInt(0, 101);
		return score;
	}

	private static void processStudentRank(int[] tots, int[] ranks, int index) {

		for (int i = 0; i < ranks.length; i++) {
			ranks [i] = 1;
			for (int j = 0; j <index; j++) {
				if(tots[i]<tots[j]) ranks[i]++;

			}

		}
	}

} // class


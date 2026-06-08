package days08;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author subin
 * @date 2026. 5. 20. 오후 12:04:13
 * @subject 배열 + 제어문
 * @content ㄴ 한 학생의 [이름, 국,영,수,총점],평균 출력.
 *          ㄴ 한 반에 30명의 학생들의  + 등수 입력, 출력. 
 *          ㄴ 
 * 
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int STUDENT_COUNT = 30;


		int index = 0;
		String [] names = new String[ STUDENT_COUNT];
		int [] kors = new int [ STUDENT_COUNT];
		int [] engs = new int [ STUDENT_COUNT];
		int [] mats = new int [ STUDENT_COUNT];
		int [] tots = new int [ STUDENT_COUNT];
		double [] avgs = new double [ STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];

		String name;
		int kor, eng, mat, tot;
		double avg;


		index = inputStudentInfo( names, kors,engs,mats,tots,avgs,index,scanner);
		
	
		


		// index = 입력받은 학생수 
		System.out.printf("\n 입력받은 학생수: %d명\n",index);
		for (int i = 0; i < index; i++) {
			System.out.printf("%d번 이름: %s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f\n",
					i+1, names[i], kors[i],engs[i],mats[i],tots[i],avgs[i]);
		}

	}

	private static int inputStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int index, Scanner scanner) { 

		String name;
		int kor, eng, mat, tot, avg; 
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();


			names [index] = name;
			kors [index] = kor;
			engs [index] = eng;
			mats [index] = mat;
			tots [index] = kor+eng+mat;
			avgs [index] = (double) tots [index]/ 3; 
			index++;

	

		return index;


	}

}//class

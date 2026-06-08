package days09;

import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex05_02;

/**
 * @author subin
 * @date 2026. 5. 21. 오후 4:20:36
 * @subject 
 * @content 3반 * 30명 이름 국어 영어 수학 입력받고 총점 평균 등수 전교등수 출력. 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
	
		//int [][][]kors = new int [3][10][30];
		//kors[1][0][0] ~ kors[1][0][29]
		
		
		                    // 행: 반, 열: 번호
		String [][] names = new String [3][30];
		
		int [][][] infos  = new int [3][30][6];
		                    // 행: 반, 열: 번호
		double [][] avgs = new double[3][30];
		
		//indexes[0]: 1반 학생의 입력한 학생수와 입력할 위치 
		//indexes[1]: 2반 학생의 입력한 학생수와 입력할 위치 
		//indexes[2]: 3반 학생의 입력한 학생수와 입력할 위치 
		  
	    int [] indexes = new int [3];
	    char con = 'y';
	    
	    //1.입력 
		Scanner scanner = new Scanner(System.in);


		String name;
		int kor, eng,mat,tot;
		double avg;
		int rank, wrank;
		int classNo; // 1,2,3반 저장할 변수
		
		do {
			//1) 반 입력- 1,2,3
			System.out.print(">1. 반 입력:");
			classNo = scanner.nextInt();	
			//2) 반 번 이름 국어 영어 수학 입력
			System.out.printf(">2. %d반 [%d번] 학생이름, 국어, 영어, 수학 입력:", classNo,indexes[classNo-1]+1);
			name = Ex05_02.generateRandomName();			
			kor = Ex05_02.generateRandomScore();			
			eng = Ex05_02.generateRandomScore();			
			mat = Ex05_02.generateRandomScore();	
			
			tot = kor + eng + mat ;
			avg = tot / 3d;
			
			names [classNo-1][indexes[classNo-1]] = name;
			infos [classNo-1][indexes[classNo-1]][0]=kor;
			infos [classNo-1][indexes[classNo-1]][1]=eng;
			infos [classNo-1][indexes[classNo-1]][2]=mat;
			infos [classNo-1][indexes[classNo-1]][3]=tot;
			avgs[classNo-1][indexes[classNo-1]] = avg;
			
			indexes[classNo-1]++;
			
			scanner.nextLine(); //제거

			//입력 계속 여부 
			System.out.print("\t 입력 계속? ");
			con = scanner.next().charAt(0);
		} while ( Character.toUpperCase(con) == 'Y' ); 



	    //2.등수,전교등수
		
		
	    //3.출력
		
		//int totalCount = indexes[0] +indexes[1]+indexes[2];
		int totalCount = IntStream.of(indexes).sum();		
		System.out.printf("[전체학생수 %d명]\n",totalCount);
		for (int i = 0; i < indexes.length; i++) {
			System.out.printf("[%d반 학생수: %d명]\n",i+1,indexes[i]);
			//indexes[i] 학생 수 만큼 정보 추력
			for (int j = 0; j < indexes[i]; j++) {
				System.out.printf(
						"> %d번 이름: %s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f, 등수:%d\n"
						, j+1, names[i][j],infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3], avgs[i][j], infos[i][j][4]);
			}
			
			
		}
		
		
		
		
		
		
		

	}//main

}//class










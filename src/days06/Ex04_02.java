package days06;

import java.util.Scanner;

/**
 * @author subin
 * @date 2026. 5. 18. 오후 2:03:09
 * @subject 제어문
 * @content 세 정수를 선언하고 스캐너로 값을 입력받아 가장 큰 값, 가장 작은 값을 찾아서 출력.
 * 
 */
public class Ex04_02 {



	public static void main(String[] args) {

		int x, y, z = 0;
		Scanner scanner = new Scanner(System.in);

		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();


		System.out.printf(">x=%d,y=%d,z=%d\n", x, y,z);
         int max = x>y ? (x>z?x:z) : (y>z?y:z);
         System.out.println("가장 큰 값"+max);
        		 
        		 
     	System.out.printf(">x=%d,y=%d,z=%d\n", x, y,z);
        int min = x<y ? (y>z? z:y) : (x>z?z:x);
       
        System.out.println ("가장 작은 값"+max);
       		 
	}//m
        	
}//c

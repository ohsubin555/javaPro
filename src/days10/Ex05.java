package days10;

import java.util.Arrays;

/**
 * @author subin
 * @date 2026. 5. 22. 오전 11:12:31
 * @subject 검색  (search)
 * @content ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것. 
 *             1) 순차 검색 (Sequence Search)
 *             2) 이진 검색 (Binary Search)
 *                필수조건: 정렬
 * 
 */
public class Ex05 {


	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };

		// Arrays.binarySearch(m, 9);

		int n = 5; //찾을 정수
		int index =binarySearch(m,n);
		System.out.println(index);

	}//m

	private static int binarySearch(int[] m, int n) {

		//while  조건 bottom <= top 마지막
		//1.bottom/top
		//2. middle 
		//3. m[middle] == m[middle] > n
		//4. m[middle] < n middle +1 새로운  bottom
		//5. m[middle] > n  middle +1 새로운  top

		int top = m.length-1;
		int count = 0;
		int bottom = 0;
		int middle;
		while (bottom <= top) {
			System.out.println( ++count);   
			middle = (bottom + top )/2;
			if (m[middle] == n) {
				return middle;

			} else if (m[middle] > n) {
				top = middle -1;


			}else{
				bottom = middle +1 ;

			}


		}

		return -1;

	}

}//c

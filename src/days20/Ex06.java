package days20;

import java.io.File;

/**
 * @author subin
 * @date 2026. 6. 9. 오후 2:15:17
 * @subject 
 * @content 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// [2] temp
		//       ㄴ 1조
		//       ㄴ 2조
		// [문제] temp 폴더 삭제...
		File f = new File(".\\temp");
		
		// 폴더 안의 하위 폴더 또는 파일이 없어야 삭제가 가능하다... 
//		if ( f.exists() ) {
//			System.out.println(  f.delete()  );			
//		}
		
		directoryDelete( f );
		
		System.out.println( " END "); 
		
		
		/* [1] 삭제 테스트
		// 1. sample 폴더 생성
		File f = new File(".\\sample");
//		f.mkdir();

		// 2.    "      삭제
		System.out.println( f.delete() ); // true
		*/ 
		
	} // main

	
	private static void directoryDelete(File f) {
		while (  !f.delete() ) {  // 하위 폴더 O
			File [] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if(  list[i].delete() ) {
					System.out.printf( "%s 삭제 완료!!\n", list[i] );
				}else {
					directoryDelete(list[i]);
				}
			}
		} // while		
	}

} // class











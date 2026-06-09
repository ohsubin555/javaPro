package days20;

import java.io.File;

public class Ex04_06 {

	public static void main(String[] args) {
		// [문제1]
		// javaPro 폴더
		//    ㄴ temp 폴더 생성
		//          ㄴ 1조  폴더 생성 
		//          ㄴ 2조  폴더 생성
		//      

		//		
		//		File f1 = new File(".\\temp\\1조");
		//		File f2 = new File(".\\temp\\2조");
		//		f1.mkdirs();
		//		f2.mkdirs();

		//		for (int i = 1; i <= 2 ; i++) {
		//			File f = new File(".\\temp\\"+i+"조"); 
		//			f.mkdirs();


		String pathname = "C:\\Class\\JavaClass\\javaPro";
		File parent = new File(pathname);

		File uploadFile = new File(parent,"temp");
		System.out.println( uploadFile.exists());

		if (!uploadFile.exists()) {
			//			System.out.println(uploadFile.mkdir());
			System.out.println(uploadFile.mkdirs());


			String temp = "C:\\Class\\JavaClass\\javaPro\\temp";
			File parent1 = new File(temp);

			File uploadFile1 = new File(parent1,"1조");
			File uploadFile2 = new File(parent1,"2조");
			System.out.println( uploadFile1.exists());


			System.out.println(uploadFile1.mkdirs()); 

			System.out.println(uploadFile2.mkdirs());


		}
	}
 
}

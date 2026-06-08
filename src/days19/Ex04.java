package days19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * @author subin
 * @date 2026. 6. 8. 오후 4:50:31
 * @subject  editplus.exe
 * @content  실행파일 복사: 문자스트림 X, 바이트스트림 O
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		String source = "C:\\Program Files (x86)\\EditPlus 3\\editplus.exe";
		String target = ".\\editplus.exe";

		fileCopy(source, target);

		System.out.println(" END ");

	} // main

	private static void fileCopy(String source, String target) {
		long start = System.nanoTime();

		try (
				// 바이트 스트림( 읽기 )	
				FileInputStream	reader = new FileInputStream(source);
				// 바이트 스트림( 쓰기 )	
				FileOutputStream  writer = new FileOutputStream(target);
				){

			int code;
			while(  ( code = reader.read() ) != -1  ) {
				// System.out.println( code );
				writer.write(code);
			} // while
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

		long end = System.nanoTime();		
		System.out.printf("> 파일 복사 처리 시간: %d ns\n", (end - start) );
	}

}
package days20;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Repeatable;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		//		String pathName = ".\\src\\days25";
		//		String pathName = ".\\src\\days20";
		String pathName = ".\\src\\days20\\Ex01.java";//t,t,f
		File f = new File(pathName);
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

		System.out.println(File.pathSeparator); //;
		System.out.println(File.separator);//\

		//파일명 Ex01.java
		String fileName = f.getName();
		System.out.println(fileName);

		int dotPos = fileName.lastIndexOf('.');

		System.out.println(fileName.substring(0, dotPos)); // Ex01
		System.out.println(fileName.substring(dotPos + 1)); // java
		
		// 파일명: Ex01.java
				
				System.out.println( fileName ); // Ex01.java
				// 순수파일명: Ex01
				int index = fileName.indexOf(".");
				String baseFileName =  fileName.substring(0, index) ;
				System.out.println( baseFileName);
				// 확장자:    java
				String ext =  fileName.substring(index) ;
				System.out.println( ext );
				
				System.out.println("=".repeat(50));
				
				//                 .\src\days20\Ex01.java
				System.out.println( f.getPath() );  // 경로
				// C:\E\Class\SS25Class\JavaClass\javaPro\.\src\days20\Ex01.java
				System.out.println( f.getAbsolutePath() ); // 절대 경로
				// C:\E\Class\SS25Class\JavaClass\javaPro\src\days20\Ex01.java
				System.out.println( f.getCanonicalPath() ); // 정규 경로
				
				System.out.println("=".repeat(50));
				System.out.println( f.getParent() ); // String
				File pf = f.getParentFile();         // File
				System.out.println( pf );
			} // main

		} // class


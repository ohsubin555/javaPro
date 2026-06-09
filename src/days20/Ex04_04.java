package days20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author subin
 * @date 
 * @subject days 19 폴더 안에 모든 자바파일을 찾아서
 *         "parent"문자열을 가지고 있는 해당파일과 라인번호 출력
 * @content 
 */
public class Ex04_04 {

	public static void main(String[] args) {
		String pathName = ".\\src\\days19";
		File parent = new File(pathName);
		File [] jf = parent.listFiles(f->f.getName().endsWith("java"));
		String keyword = "parent";

		for (int i = 0,lineNumber = 0; i < jf.length; i++) {
			File f = jf[i];
			lineNumber =1;
			String fileName = f.getName();
			String line = null;
			try (FileReader in = new FileReader(f);
					BufferedReader br = new BufferedReader(in);
					){

				while ((line = br.readLine())!=null) {
					if (line.contains(keyword)) {
						line =line.replaceAll( keyword, "["+keyword+"]");
						line = line.replaceAll( keyword, "<span style='color:red'>"+ keyword+"</span>");

						System.out.printf( "%s: %d: %s\n"
								, fileName, lineNumber, line );
					}
				       lineNumber++;

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}//main

}//class

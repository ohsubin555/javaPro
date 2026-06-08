/**
 *
 */
package days18;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author subin
 * @date 2026. 6. 5. 오후 2:24:24
 * @subject 
 * @content 
 * 
 */
public class Ex11 {
	
	public static void main(String[] args) {
		String group = "1조:양인석/안정빈/신창만/이지훈/장미성";
		String [] groupArr = group.split(":");
		// 1. Properties 컬렉션
		// 팀명 key 팀원 value
		
		// 2.  group1.properties 파일에 1조원등 저장하는 코딩을 하자..
		
		String fileName = ".\\src\\days18\\group1.properties"; 
		// 1ì¡°=ìì¸ì/ìì ë¹/ì ì°½ë§/ì´ì§í/ì¥ë¯¸ì±
				Properties p = new Properties(); 
				p.setProperty(groupArr[0], groupArr[1]); 
		
		try ( 
				FileWriter writer = new FileWriter(fileName); 
				){
			p.store(writer, "comments"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println( " END " );
		
		

	} // main

} // class

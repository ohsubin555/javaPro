package days18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author subin
 * @date 2026. 6. 5. 오후 2:09:10
 * @subject Properties 컬렉션. 
 *           ㄴ key String, value String
 *           ㄴ 주로 설정 파일을 읽기/쓰기
 *           ㄴ ???.properties 확장자명
 *           ㄴ Hashtable의 자식 클래스  
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\database.properties";
		String fileName2 = ".\\src\\days18\\database.xml";
		
		// DB 연결 문자열( ConnectionString )
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";
		
				Properties p = new Properties();
				// p.put(className, p)
				p.setProperty("url", url);
				p.setProperty("user", user);
				p.setProperty("password", password);
				p.setProperty("className", className);
		
		try ( 
				FileWriter writer = new FileWriter(fileName);
				FileOutputStream os = new FileOutputStream(fileName2);
				){
			p.store(writer, "comments");
			p.storeToXML(os, "comments");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println( " END " );
		

	} // main

} // class



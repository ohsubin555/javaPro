package days18;

import java.io.FileReader;
import java.util.Properties;

public class Ex10_02 {

	public static void main(String[] args) {
		// database.properties 파일을 읽어와서 Properties 객체  p로 만들고
		// p 로 부터 DB 연결 문자열 정보를 얻어와서 출력.

		String fileName = ".\\src\\days18\\database.properties";


		// DB 연결 문자열( ConnectionString )
		String className = null;  // JDBC드라이버            
		String url = null;                  
		String user = null;                                                                   
		String password = null;

		Properties p = new Properties();

		try ( 
				FileReader reader = new FileReader(fileName);
				){
			// p 객체      -> 파일로 저장할 때는      :   store()
			// 파일 읽어와서 -> p 객체 생성할 때는      :    load()
			p.load(reader);

			className = p.getProperty("className");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");
			System.out.println( className );
			System.out.println( url );
			System.out.println( user );
			System.out.println( password );

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println( " END " );


	} // main

}

// p 객체   setProperties()          -> p.store() -> FileWrtier->   ???.properties 파일로 저장
//???.properties 파일로 -> FileReader -> p.load() 생성 -> p.getProperties("user") 와서 사용~

package days21.sec09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author subin
 * @date 2026. 6. 10. 오후 12:33:19
 * @subject data.txt -> Files.lines(Path, Charset) -> Stream 
 * @content 
 * 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// data.txt -> Path 객체 
		Path path =  Paths.get(Ex04.class.getResource("data.txt").toURI()) ;
		//           Paths.get(URI);  URI -> Path객체 반환
		//                         data.txt -> URI 
		//                   Ex04 클래스와 같은 패키지 안에 있는 data.txt 파일을 찾아서
		//                   toURI()메소드로 URI 를 만들겠다..
		Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // UTF-8

		stream.forEach(line -> System.out.println(line) );
	} // main

} // class








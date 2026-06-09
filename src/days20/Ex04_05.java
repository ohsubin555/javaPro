package days20;

import java.io.File;

/**
 * @author subin
 * @date 
 * @subject 첨부파일: 파일 업로드...
 *          ㄴ 회원가입 폴더
 *          ㄴ 상품 등록 폴더
 * @content 
 */
public class Ex04_05 {

	public static void main(String[] args) {
		// days 20 폴더 안에 upload 폴더 유무 확인하고 존재하지 않으면 폴더 생성
		
		String pathname = ".\\src\\days20";
		File parent = new File(pathname);
		
		File uploadFile = new File(parent,"upload");
		System.out.println( uploadFile.exists());
		
		if (!uploadFile.exists()) {
//			System.out.println(uploadFile.mkdir());
			System.out.println(uploadFile.mkdirs());
			// 차이점: 
			
			//   mkdir( ".\\src\\days20\\team\\upload" ) X
			//   mkdirs( ".\\src\\days20\\team\\upload" ) O


		}

	}

}

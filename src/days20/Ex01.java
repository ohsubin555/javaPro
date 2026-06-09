package days20;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author subin
 * @date 
 * @subject days19 Ex06.java
 * @content DataInputStream <-  student.dat
 *                        기본형 읽기위한 메소드 

 */
public class Ex01 {

	public static void main(String[] args) {

		String name ;
		int kor, eng, mat;
		int tot ;
		double avg ;
		boolean gender ;

		String fileName = ".\\student.dat";  // [dat]a

		try (
				FileInputStream out = new FileInputStream(fileName);	
				DataInputStream dis = new DataInputStream(out);	
				){
			// 스트림(빨대)
			name =dis.readUTF();
			kor = dis.readInt();
			eng= dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg =dis.readDouble();
			gender = dis.readBoolean();
			// 입(파일)
			System.out.printf("%s,%d,%d,%d,%d,%f,%b", name,kor,eng,mat,tot,avg,gender);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" END ");

	}

}

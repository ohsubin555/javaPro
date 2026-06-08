package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author subin
 * @date 2026. 5. 13. 오후 3:24:15
 * @subject 이름, 국,영,수 키보드로부터 입력-> 각각의 변수 저장한 후
 * @content 총점, 평균
 *          출력..
 */
public class Ex07_02 {

	   public static void main(String[] args) throws IOException {
		      // 1. br 객체 생성
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      
		      
		      String name;      
		      
		      int kor = 0 , eng = 0 , mat = 0;
		      int tot = 0;  
		      double avg = 0;
		      
		      System.out.print("> 이름 입력: ");
		      name = br.readLine();
		     
		      
		   
		      System.out.print("> 국어 입력: ");
		      kor = Integer.parseInt(  br.readLine());
		    	
		      System.out.print("> 영어 입력: ");
		      eng = Integer.parseInt(  br.readLine());
		    	
		      System.out.print("> 수학 입력: ");
		      mat = Integer.parseInt(  br.readLine());
		    	
		      tot = kor + eng + mat ;
		      avg = (double) tot / 3;
		    		  
		 
		      System.out.printf("이름: %s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%f\n"
		            , name, kor, eng, mat, tot, avg);
	   }
	   
	   
	   
	   
		   } // main
	      


	    


	    
	    
	 
	   
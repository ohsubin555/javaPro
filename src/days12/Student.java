package days12;

public class Student {
	
	//필드
	
	public int no;
	public String name;
	public int kor,eng,mat,tot,rank,wrank;
	public double avg;
	

	//메소드

	public String getInfo() {
	      return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d"
	            , no
	            , name 
	            , kor , eng , mat, tot 
	            , avg , rank, wrank);
	      
	      
	      
	      
	   }
	
	
	/*
+----------------+
|   Student      |
+----------------+
| name           |
| kor            |
| eng            |
| math           |
| total          |
| avg            |
| rank           |
+----------------+
| calcTotal()    |
| calcAvg()      |
+----------------+


        ▲
        |
        |

+--------------------+    학생들 리스트 관리 클래스 
|  StudentManager    |
+--------------------+    
| List<Student>      |    Student [] students; 배열
+--------------------+ 
| addStudent()       |   
| printStudents()    |
| processRank()      |
+--------------------+





	 * 
	 * 
	 * 
	 * 
	 */
	
}//class

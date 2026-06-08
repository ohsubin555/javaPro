package days14;
                                                                   
/**
 * @author subin
 * @date 2026. 5. 29. 오후 4:38:32
 * @subject 
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
	
		//JDBCDriver
		//MySQLDriver
		//OracleDriver
		//MSSQLDriver
		
		JDBCDriver con = new OracleDriver();
		con.open();
		
		con.select();
		con.insert();
		con.delete();
        con.close();		
		con.select();
		con.insert();
		con.delete();
		

		con.close();

	}//main

}//class

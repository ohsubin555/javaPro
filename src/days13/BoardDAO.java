package days13;

import java.awt.image.VolatileImage;



public class BoardDAO {

	//이중잠금 확인 ㅇ치 QKDKTLRDPTJ VLFTN 
	private static  volatile  BoardDAO boardDAO=null;
	
	private BoardDAO() {
		
		
	}
	
	public static  BoardDAO getInstance() {
		if (boardDAO == null) {
	           synchronized (BoardDAO.class) {
	               boardDAO = new BoardDAO();
	           }
	            }
		return boardDAO;       
	}	
	// CRUD CREATE READ UPDATE DLETE
      public void create() {
    	  System.out.println("게시글 작성");
      }
      public void read() {
    	  System.out.println("게시글 작성");
      }
      public void update() {
    	  System.out.println("게시글 수정");
      }
      public void delete() {
    	  System.out.println("게시글 삭제");
      }
}

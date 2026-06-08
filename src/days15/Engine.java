package days15;

public interface Engine {
	
	
	
	//method
     void moreFuel (int fuel);
     
     void lessFuel (int fuel);

     void stop();
     
     default void turbo() {
    	 System.out.println("기본 터보 기능 구현");
    	 
     }
    	 
    	 static void test() {
    			System.out.println("10년 지난 후에 새로운 기능 메소드 추가");
    		
    	 
     }
}

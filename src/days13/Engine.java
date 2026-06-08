package days13;

public class Engine {
	
	//field 
	 private String model; // name of model
	 private int displacement; // 배기량 cc
	 private int horsepower; // 마력
	 private boolean running; // 시동 상태
	 
	 int speed;
	 
	
	
		//field 
	
	
	//method
     void moreFuel (int fuel) {
     this.speed += fuel * 0.05;
     }
     
     void lessFuel (int fuel) {
    	 this.speed -= fuel * 0.05;
     }

     void stop() {
    	 this.speed = 0;
     }
}

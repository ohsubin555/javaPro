package days13;

public class Car {


	String name;
	String geartype;
	int door;
	private Engine engine ;



	public Car(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


  void speedUP (int fuel) {
	  this.engine.moreFuel(fuel);
  }

  
  void speedUDown (int fuel) {
	  this.engine.lessFuel(fuel);
  }   
  
  void stop () {
		 this.engine.stop();
  }

}	

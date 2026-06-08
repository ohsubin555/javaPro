package days15;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {
	
	private String name;
	private String geartype;
	private int door;
	
	private Engine engine ;


	public Car(Engine engine) {
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


  public void stop(int i) {
	// TODO Auto-generated method stub
	
  }

}	

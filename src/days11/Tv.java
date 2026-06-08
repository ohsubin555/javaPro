package days11;

public class Tv {

    //필드- 속성(특징)
	public String color;
	boolean power = false;
	public int channel = 11;  
	
	
    //메소드- 동작(기능)
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}

}

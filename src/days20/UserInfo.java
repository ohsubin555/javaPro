package days20;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8514887394001967930L;
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("UnKnown", "1111", 0);
		}
	public UserInfo(String name, String password,int age)
	 {
		this.name = name;
		this.password = password;
		this.age = age;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}

package days17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08 {

	public static void main(String[] args) {

		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};

		//ArrayList list = new ArrayList();
		
		
		//T==type
     	List list =	Arrays.asList(names);
     	System.out.println(list);
     	ArrayList alist = new ArrayList(list);
		
		
		
		
     	
		/*
     	ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println(list);*/
	}

}

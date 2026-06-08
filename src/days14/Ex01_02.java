package days14;

import java.util.Arrays;

public class Ex01_02 {

	
	public static void main(String[] args) {

		String n = "publicStaticVoidMainStringArgs";
		//String m = "VoidMainStigArgspublicStatic";
		String m = "publicStaticVoidMainStringARGs";


		int [] countArrn = new int [26];
		int [] countArrm = new int [26];
		
		char [] nArr = n.toUpperCase().toCharArray();
		char [] mArr = m.toUpperCase().toCharArray();

		for (int i = 0; i < nArr.length; i++) {

			int index1 = nArr[i]-65;

			countArrn[index1]++;
		}
		
		
		
		for (int i = 0; i < mArr.length; i++) {

			int index2 = mArr[i]-65;

			countArrm[index2]++;
		}
		
		
		System.out.println(Arrays.equals(countArrn, countArrm));
		//System.out.println(Arrays.toString(countArr));


//		
//		if(isEqual) { System.out.println("같음");
//
//		} else { System.out.println("다름");
//
//		}
//


	}//main

}//class

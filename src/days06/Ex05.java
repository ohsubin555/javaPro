package days06;

/**
 * @author subin
 * @date 2026. 5. 18. 오후 2:30:16
 * @subject 많은 수 중에 가장 큰 값, 작은 값
 * @content (배열사용)
 * 
 */
public class Ex05 {

	public static void main(String[] args) {

		
		int [] m = new int [10];
	
		
		//m[0] = 0
				
	    for (int i = 0; i < m.length; i++) {
	    	m[i]= (int)(Math.random()*100)+1;
	    	System.out.printf("m[%d]=%d\n",i, m[i]);
			
		}
		
		int max = m[0];
		for (int i = 0; i < m.length; i++) {
			
			if (max<m[i]) {
				max = m[i];
			}
		
		}
		System.out.println("배열의 가장 큰 값" + max);
		
		
		int min = m[0];
		for (int i = 0; i < m.length; i++) {
			
			if (min>m[i]) {min = m[i];
				
			}
			
		}
		System.out.println("배열의 가장 작은 값" + min);
		
		
		
		
	}//m

}//c

package days10;

public class Ex06 {

	public static void main(String[] args) throws InterruptedException {

		int[][]m = new int [5][5];
		//fillM(m);
		//fillM2(m);
		
		
		
	      // __*
	      // _***
	      // *****
	      
	      // __*
	      // _***
	      // *****
	      // _***
	      // __*
		magicSquare(m); //홀수마방진
		
		
		
		dispM(m);

	}//main

	private static void magicSquare(int[][] m) throws InterruptedException {
		
		int v = 1;
		int row = 0,col = m[0].length/2; //행과열
		m[row][col] = v++;
		    
		
//	    1의 위치는 0번째 행 가운데 열. 
//		열증가,행감소 반복 if 5의 배수라면 열증가만. 
//		열에서 벗어나면 가장 작은 열, 행에서 벗어나면 가장 큰 행 으로. 
		

		
		while (v <25) {
			
			if (v%5==0) {
				row++;
			} else {
              col++; row--;
              if (row == -1) {
				row = m.length-1;
			}
              if (col==m[0].length) { col = 0;
				
			}
              dispM(m);
              
                        
              Thread.sleep(1000);
              
              m[row][col] = ++v;
			}
		
		
		}
		
		
	}

	private static void fillM2(int[][] m)throws InterruptedException {
		
//		for (int i = 0, v= 1; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++,v++) {
//				m[j][i] = v;


				for (int i = 0, v= 1; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++,v++) {
						//m[j][i] = 5*i+j+1;
						m[i][j] = i+1+j*m[i].length;



			}		
		}


	}

	private static void fillM(int[][] m) {

		for (int i = 0, v= 1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++,v++) {
				m[i][j] = v;

			}		
		}

	}

	private static void dispM(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);

			}
			
			System.out.println();
		}
		System.out.println();
	}

}//class

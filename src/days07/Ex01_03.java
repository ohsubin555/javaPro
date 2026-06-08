package days07;

public class Ex01_03 {


	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {

			for (int dan = 2; dan < 10; i++) {
				if (dan==5) 
					break;
				System.out.printf("%d*%d=%02d ",dan,i,dan*i);

			}	//for i

			System.out.println();
		}//for dan

	}//class

//main


}



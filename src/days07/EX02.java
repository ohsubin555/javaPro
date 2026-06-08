package days07;

public class EX02 {

	public static void main(String[] args) {

		String inputValue = "홍길동     ,    98, 78,77";

		// String은 불변한다. 
		//inputValue = inputValue.replace(" ", "");
		String name;
		//System.out.println(inputValue);
		int kor ,eng ,mat;

		//메서드의 매개변수로  String regex 선언
		// regex == Regual Expression == 정규표현식
		String [] dataArr = inputValue.split("\\s*,\\s*");
		System.out.println(dataArr.length);

		name = dataArr[0];
		/*kor =  Integer.parseInt(dataArr[1].trim()); //앞 뒤 공백을 갯수 상관없이 제거함.
		eng =  Integer.parseInt(dataArr[1].trim()); //앞 뒤 공백을 갯수 상관없이 제거함.
		mat =  Integer.parseInt(dataArr[1].trim()); //앞 뒤 공백을 갯수 상관없이 제거함.
		*/
		//System.out.println(dataArr[1])

		kor =  Integer.parseInt(dataArr[1]); 
		eng =  Integer.parseInt(dataArr[1]); 
		mat =  Integer.parseInt(dataArr[1]);
		
		System.out.println( inputValue);
		
      
	int tot = kor + eng + mat;
		System.out.println(tot);



	}//M

}//C

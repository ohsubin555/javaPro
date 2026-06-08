package days05;

public class Ex07_00 {

	public static void main(String[] args) {
		
int [] lottoNumbers = new int [6];
int lottoNumber;

int index = 0;
boolean isFlag = false;
while (index<lottoNumbers.length) {
	lottoNumber = (int)(Math.random()* 45) + 1;
	System.err.println(">중복체크 전 로또번호 + 로또번호:"+lottoNumber);
	
	for (int i = 0; i < index; i++) {
		if(lottoNumbers[i]==lottoNumber) {
			isFlag = true;
			break;
		}
		
	}
}
		
	}
}
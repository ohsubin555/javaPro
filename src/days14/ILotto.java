package days14;

public interface ILotto {


	//public final static int LENGTH = 6;
	int LENGTH = 6;
	
	
	
	void fillLotto(int [] lotto);   // public abstract 생략
	void dispLotto(int [] lotto);
	void isDuplicateLotto(int [] lotto);
}

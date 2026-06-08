package days13;

public class Ex06_02 {

	public static void main(String[] args) {
		Document doc1 = new Document ();
		Document doc2 = new Document ();
		Document doc3 = new Document ();
		Document doc4 = new Document ("자바문서.txt");
		Document doc5 = new Document ();


	}//main

}//class

class Document {

	String fileName;
	static 	int count = 1;

	Document(){

		this(String.format("Noname%d.txt", count++));
		//String fileName = String.format("Noname.txt", this.count);
		//The Java feature 'Flexible Constructor Bodies' is only available with source level 25 and above
	}

	public Document(String filename) {
		this.fileName = filename;
		System.out.printf("문서 \"%s\"가 생성되었음 \n", this.fileName);



	}


}
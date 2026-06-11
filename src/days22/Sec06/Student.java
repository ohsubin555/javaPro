package days22.Sec06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student {
	
	private String name;    // 이름 중복  X  key
	private String gender;
	private int score;      //             value

}

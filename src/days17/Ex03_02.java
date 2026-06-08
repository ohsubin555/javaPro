package days17;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex03_02 {

	public static void main(String[] args) {
		//오늘 수업을 시작하고 현재 얼마의 시간이 흘렀는가
		
		
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime nt = LocalTime.now();
		
		Duration d = Duration.between(st, nt);
		int d_ns = d.getNano();
		System.out.println(d_ns);
		
		long d_s = d.getSeconds();
		System.out.println(d_s);
		
		//d.getSeconds()/(60*60) //시간
		
		int m = (int) (d.getSeconds()/60);
		int s = (int) (d.getSeconds()%60); //분, 초
		System.out.println(m);
		
		// X System.out.println(d.get(ChronoUnit.MINUTES));

	}

}

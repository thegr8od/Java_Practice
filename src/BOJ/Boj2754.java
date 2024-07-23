package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2754 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		double grade = 0;
		char c = str.charAt(0);
		
		if (c == 'A') {
			grade = 4;
		} else if (c == 'B') {
			grade = 3;
		} else if ( c == 'C') {
			grade = 2;
		} else if (c == 'D') {
			grade = 1;
		} else {
			System.out.println("0.0");
			return;
		}
		char c2 = str.charAt(1);
		if (c2 == '+') {
			grade += 0.3;
		} else if (c2 == '-') {
			grade -= 0.3;
		} 
		System.out.println(grade);
	}

}

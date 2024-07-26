package BOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj11721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for(int i =0; i<input.length(); i++) {
			System.out.print(input.charAt(i));
			if(i%10 == 9) {
				System.out.println();
			}
		}
		
	}
}

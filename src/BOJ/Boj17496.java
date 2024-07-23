package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17496 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		
		String[] parts = input.split(" ");
		int n = Integer.parseInt(parts[0]);
		int t = Integer.parseInt(parts[1]);
		int c = Integer.parseInt(parts[2]);
		int p = Integer.parseInt(parts[3]);
		
		int ans = ((n-1)/t)*c*p;
		
		System.out.println(t);
		System.out.println(ans);
	}
}

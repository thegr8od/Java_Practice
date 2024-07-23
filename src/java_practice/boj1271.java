package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj1271 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		
		String[] parts = input.split(" ");
		
		BigInteger n = new BigInteger(parts[0]);
		BigInteger m = new BigInteger(parts[1]);
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		
	}
}

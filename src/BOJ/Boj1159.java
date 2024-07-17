package BOJ;

import java.util.Scanner;

public class Boj1159 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			String name = sc.next();
			int ch = name.charAt(0) - 97;
			arr[ch]++;
		}
		StringBuilder sb = new StringBuilder();
		
		for (int j = 0; j<arr.length; j++) {
			if(arr[j] >= 5) {
				sb.append((char)(j+97));
			}
		}
		
		if (sb.length() ==0) {
			System.out.print("PREDAJA");
		}
		else {
			System.out.println(sb);
		}
		
	}

}

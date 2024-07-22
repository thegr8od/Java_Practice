package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10817 {

	public static void main(String[] args) {
		int ans =0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0; i<3; i++) {
			int n = sc.nextInt(); 
			arr[i] = n;
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}

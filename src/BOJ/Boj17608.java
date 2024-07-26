package BOJ;

import java.util.Scanner;

public class Boj17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int std = arr[n-1];
		int cnt = 1;
		for (int i=n-2; i>=0; i--) {
			if (arr[i] > std) {
				std = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

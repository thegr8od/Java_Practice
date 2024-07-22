package BOJ;

import java.util.Scanner;

public class Boj13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ban = new int[n];
		
		for(int i=0; i<n; i++) {
			ban[i]=sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double cnt = 0;
		for(int i =0; i<ban.length; i++) {
			if(ban[i]<=b) {
				cnt++;
				continue;
			}
			else {
				cnt++;
				ban[i] -= b;
				if(ban[i]%c ==0) {
					cnt+=ban[i]/c;
				}
				else if(ban[i]%c!=0) {
					cnt+=ban[i]/c+1;
				}
			}
		}
		System.out.printf("%.0f",cnt);
		
		
	}
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i =0; i<3; i++) {
		int n = Integer.parseInt(br.readLine());
		BigInteger ans = new BigInteger("0");
		for(int j=0; j < n; j++) {
			BigInteger b = new BigInteger(br.readLine());
			ans = ans.add(b);
		}
		if(ans.compareTo(BigInteger.ZERO) == -1) {
			System.out.println("-");
		}else if(ans.compareTo(BigInteger.ZERO) == 1) {
			System.out.println("+");
		}else {
			System.out.println(0);
		}
	}
	}
}

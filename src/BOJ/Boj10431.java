package BOJ;

import java.util.*;
import java.io.*;

public class Boj10431 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        int[] data = new int[20];

        for (int i = 0; i < tc; i++) {
            int cnt = 0;

            int t = scanner.nextInt();
            
            for (int j = 0; j < 20; j++) {
                data[j] = scanner.nextInt();
            }
            
            // 케이스별로 자기보다 큰 값 몇개있는지 세서 더해주기

            for (int k = 0; k < 20; k++) {
                for (int l = 0; l < k; l++) {
                    if (data[k] < data[l]) {
                        cnt++;
                    }
                }
            }
            System.out.println(t + " " + cnt);
        }
    }
}

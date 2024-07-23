package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14720 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String arr[] = str.split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        int cnt = 0;
        int milk = 0; // 0: 딸기, 1: 초코, 2: 바나나

        for (int i = 0; i < n; i++) {
            if (numbers[i] == milk) {
                cnt++;
                milk = (milk + 1) % 3; // 다음 우유로 넘어가기
            }
        }

        System.out.println(cnt);
    }
}

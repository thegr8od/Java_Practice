package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16967 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 버퍼리더 처음 사용
		// - **Scanner**: Space, Enter 모두 경계로 인식
		// - **BufferedReader**: Enter만 경계로 인식	
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
	
		int[][] Data = new int[H+X][W+Y];
		
		for (int i =0; i< H+X; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j =0 ; j < W+Y; j++) {
				Data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] Ans = new int[H][W];
	
		for (int i =0; i< H; i++) {
			for (int j =0; j<W; j++) {
				if (i >= X && j >= Y) {
					Ans[i][j] = Data[i][j] = Ans[i-X][j-Y];
					// 만약 i가 1 j가 1일땐 0,0 의 값을 빼주고
					// 만약 i가 1 j가 2일땐 0,1 의 값을 뺴주면 됨.
				} else {
					Ans[i][j] = Data[i][j];
				}
			}
			

		}
		for (int i =0; i <H; i++) {
			for (int j=0; j<W; j++) {
				System.out.print(Ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}

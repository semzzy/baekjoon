package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//11660 구간 합 구하기 2
public class Code11660 {
	public static void main(String[] args) throws IOException {
		// 2차원 배열 구간 합 구하기

		System.setIn(new FileInputStream("src/baekjoon/code11660"));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int[][] A = new int[N+1][N+1];
		//원 배열에 값 담기
		for(int i=1; i<=N; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		
		int[][] S = new int[N+1][N+1];
		//구간합 배열에 계산 값 담기
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				  S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j];
			}
		}
		
		for(int i=0; i<M; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken()); 
			int y1 = Integer.parseInt(stringTokenizer.nextToken()); 
			int x2 = Integer.parseInt(stringTokenizer.nextToken()); 
			int y2 = Integer.parseInt(stringTokenizer.nextToken()); 
			
			//질의 값
			System.out.println(S[x2][y2]-S[x2][y1-1]-S[x1-1][y2]+S[x1-1][y1-1]);
			
		}
	}

}

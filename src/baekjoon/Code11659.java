package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//11659 구간 합 구하기 4
public class Code11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/baekjoon/code11659"));
		Scanner sc = new Scanner(System.in);
  
		int T; //계산할 수 개수
		int N; //계산할 정렬 개수
		T = sc.nextInt();
		N = sc.nextInt();

		int[] A = new int[T]; // 수 배열
		int[] S = new int[T]; // 구간 합 배열
 
		for (int i = 0; i < T; i++) {
			//입력된 수 저장
			A[i] = sc.nextInt();
		}
		
		//구간 합 계산
		S[0] = A[0];
		for(int i=1; i<T; i++) {
			S[i] = A[i] + S[i-1];
			//System.out.println(S[i]);
		}
 
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
					
			//System.out.println("S[b] : "+ (S[b] -  S[a-1]));					
					
			if(a == 1) {
//				System.out.println("S[b] : "+S[b-1]);
				System.out.println(S[b-1]);
			}
			else if(a == b) {
//				System.out.println("S[b] : "+A[b-1]);
				System.out.println(A[b-1]);
			}
			else {
//				System.out.println("S[b] : "+ (S[b-1] -  S[a-2]));
				System.out.println(S[b-1] -  S[a-2]);
			}
			
		}
	}
}
//예시답안
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//		int suNo = Integer.parseInt(stringTokenizer.nextToken());
//		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
//		long[] S2 = new long[suNo+1];
//		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//		for(int i=1; i<=suNo; i++) {
//			S2[i] = S2[i-1] + Integer.parseInt(stringTokenizer.nextToken());
//			//System.out.println(S2[i]);
//		}
//		for(int q=0; q<quizNo; q++) {
//			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//			int i = Integer.parseInt(stringTokenizer.nextToken());
//			int j = Integer.parseInt(stringTokenizer.nextToken());
//			System.out.println(S2[j] - S2[i-1]);
//		}

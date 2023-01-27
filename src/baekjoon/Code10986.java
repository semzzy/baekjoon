package baekjoon;

import java.io.IOException;
import java.util.Scanner;

//10986 나머지 합
public class Code10986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("src/baekjoon/code10986"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //수열 개수
		int M = sc.nextInt();  //나눌 수
		long[] S = new long[N]; // 수열의 구간 합 배열
		long[] C = new long[M]; // 구간 합의 나머지 배열
		long answer = 0; //질의 답
		S[0] = sc.nextInt(); 
		// 구간 합 계산
		for (int i = 1; i < N; i++) {
			S[i] = S[i - 1] + sc.nextInt();
		}
		//구간 합 나머지 계산
		for(int i=0; i<N; i++) {
			int rm = (int) (S[i] % M);
			//0~i 구간 합의 나머지가 0일 때 정답 count
			if(rm == 0) answer++; 
			//나머지가 같은 인덱스 개수 count
			C[rm]++;
		}
		
		for(int i=0; i<M; i++) {
			if(C[i]>1) {
				//나머지가 같은 인덱스 중 2가지를 뽑는 경우의 수 더하기
				answer = answer + (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);
	}

}

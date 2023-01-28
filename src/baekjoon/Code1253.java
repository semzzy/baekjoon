package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1253 좋다
public class Code1253 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/baekjoon/code1253"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수의 개수 (|Ai| ≤ 1,000,000,000)
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		} 
		Arrays.sort(A);
		int count = 0; //좋은 수 개수
		for(int i=0; i<N; i++) { //주어진 수만큼
			long K = A[i]; //찾을 수
			int startIndex = 0;
			int endIndex = N-1;
			while(startIndex<endIndex) {
				long sum = A[startIndex] + A[endIndex];
				if(sum == K) { //두 포인터 합이 찾을 수랑 같을 때 => 좋은 수 대상
					if(startIndex != i && endIndex != i) { //자신 제외 일 때만 좋은 수
						count++;
						break;
					}
					else if(startIndex == i) { //시작 포인터가 i인 경우 ++
						startIndex++;
					}
					else if(endIndex == i) { //종료 포인터가 i인 경우 --
						endIndex--;
					}
				}
				else if(sum > K) { //찾을 수보다 합이 크면 종료 포인터 --
					endIndex--;
				}
				else {
					startIndex++; //찾을 수보다 합이 작으면 시작 포인터 ++
				}
			}
		}
		System.out.println(count);
	}

}

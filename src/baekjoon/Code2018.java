package baekjoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//2018 수들의 합 5 --> 투 포인터
public class Code2018 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/baekjoon/code2018"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 제시된 정수(1 ≤ N ≤ 10,000,000)
		int sum = 1; // 합
		int count = 1; // 개수
		int startIndex = 1; //시작 인덱스
		int endIndex = 1; //종료 인덱스
		
		while(endIndex != N) {
			if(sum == N) {
				count++;
				endIndex++;
				sum = sum + endIndex;
			}
			else if(sum > N) {
				sum = sum - startIndex;
				startIndex++;
			}
			else {
				endIndex++;
				sum= sum + endIndex;
			}
		}
		
		System.out.println(count);
	}
}

package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1253 ����
public class Code1253 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/baekjoon/code1253"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ���� ���� (|Ai| �� 1,000,000,000)
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		} 
		Arrays.sort(A);
		int count = 0; //���� �� ����
		for(int i=0; i<N; i++) { //�־��� ����ŭ
			long K = A[i]; //ã�� ��
			int startIndex = 0;
			int endIndex = N-1;
			while(startIndex<endIndex) {
				long sum = A[startIndex] + A[endIndex];
				if(sum == K) { //�� ������ ���� ã�� ���� ���� �� => ���� �� ���
					if(startIndex != i && endIndex != i) { //�ڽ� ���� �� ���� ���� ��
						count++;
						break;
					}
					else if(startIndex == i) { //���� �����Ͱ� i�� ��� ++
						startIndex++;
					}
					else if(endIndex == i) { //���� �����Ͱ� i�� ��� --
						endIndex--;
					}
				}
				else if(sum > K) { //ã�� ������ ���� ũ�� ���� ������ --
					endIndex--;
				}
				else {
					startIndex++; //ã�� ������ ���� ������ ���� ������ ++
				}
			}
		}
		System.out.println(count);
	}

}

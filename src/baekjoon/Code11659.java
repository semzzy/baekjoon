package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//11659 ���� �� ���ϱ� 4 --> 1���� �迭 ������
public class Code11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/baekjoon/code11659"));
		//Scanner sc = new Scanner(System.in);
  
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int N; //����� �� ����
		int T; //����� ���� ����
		N =Integer.parseInt(stringTokenizer.nextToken());
		T = Integer.parseInt(stringTokenizer.nextToken());
 
		int[] S = new int[N+1]; // ���� �� �迭

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <= N; i++) {
			//���� �� ���
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int t=0; t<T; t++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		} 
	}
}
//���ô��
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

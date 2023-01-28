package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1940 �ָ�
public class Code1940 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/baekjoon/code1940"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // ���õ� ����� ��(1 �� M �� 10,000,000)
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // ���õ� ��(1 �� N �� 10,000,000)
		int A[] = new int[N];

		st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken()); 
		}
		 
		int count = 0; // ���� 
 
        for(int startIndex=0; startIndex<N; startIndex++)  {
            int sum = 0;
            int endIndex = startIndex+1;

            while (endIndex<N) { //����� �� ���� ��������
                sum = A[startIndex]; 
                sum += A[endIndex++];
                if (sum == M) {
                	count++;
                    break;
                }
            }

        } 
		System.out.println(count);
	}

}

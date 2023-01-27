package baekjoon;

import java.io.IOException;
import java.util.Scanner;

//10986 ������ ��
public class Code10986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("src/baekjoon/code10986"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //���� ����
		int M = sc.nextInt();  //���� ��
		long[] S = new long[N]; // ������ ���� �� �迭
		long[] C = new long[M]; // ���� ���� ������ �迭
		long answer = 0; //���� ��
		S[0] = sc.nextInt(); 
		// ���� �� ���
		for (int i = 1; i < N; i++) {
			S[i] = S[i - 1] + sc.nextInt();
		}
		//���� �� ������ ���
		for(int i=0; i<N; i++) {
			int rm = (int) (S[i] % M);
			//0~i ���� ���� �������� 0�� �� ���� count
			if(rm == 0) answer++; 
			//�������� ���� �ε��� ���� count
			C[rm]++;
		}
		
		for(int i=0; i<M; i++) {
			if(C[i]>1) {
				//�������� ���� �ε��� �� 2������ �̴� ����� �� ���ϱ�
				answer = answer + (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);
	}

}

package baekjoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//2018 ������ �� 5 --> �� ������
public class Code2018 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/baekjoon/code2018"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ���õ� ����(1 �� N �� 10,000,000)
		int sum = 1; // ��
		int count = 1; // ����
		int startIndex = 1; //���� �ε���
		int endIndex = 1; //���� �ε���
		
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

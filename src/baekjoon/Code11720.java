package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11720 ������ ��
public class Code11720 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("src/baekjoon/code11720"));
		Scanner sc = new Scanner(System.in);
  
		String T; // ���� ��
		T = sc.nextLine();

		int[] arr = new int[Integer.parseInt(T)]; // �� �迭
		String num; // �о�� �� 
		int sum = 0; // �հ� 
 
		num = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(T); i++) {
			//�Էµ� �� ����
			arr[i] = Integer.parseInt(num.substring(i, i+1));
		}

		//�հ� ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		//���
		System.out.println(sum);
	}

}

package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11720 ������ ��
public class Code11720 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/baekjoon/code11720"));
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

//���� ���
//Scanner sc2 = new Scanner(System.in);
//int N = sc2.nextInt();
////�Է� ���� String�� ���� sNum�� ������ �� char[]�� ������ ��ȯ�ϱ�
//String sNum = sc2.next();
//char[] cNum = sNum.toCharArray();
//int sum2 = 0;
//for(int i=0; i<cNum.length; i++) {
//	sum2 += cNum[i] - '0'; //cNum[i]�� ���������� ��ȯ�ϸ鼭 sum�� ���Ͽ� �����ϱ�
//}
//System.out.println(sum2);
//
///* ���ڿ��� ���������� �����Ϸ��� �ƽ�Ű�ڵ带 ����ؾ���.
// * �ƽ�Ű�ڵ忡�� ���� �ǹ��� ���ڿ� ������ �ڵ� �� ���̴� 48�̴�.
// * ���� ��� ����'1'�� �ƽ�Ű�ڵ� ���� 49�̹Ƿ� ���� '1'�� ���� 1�� ��ȯ�Ϸ��� '1' - 48 �Ǵ� '1'-'0'�� ���� �����Ѵ�. */

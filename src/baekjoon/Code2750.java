package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2750 �� �����ϱ�
public class Code2750 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
				//System.setIn(new FileInputStream("src/baekjoon/code2750"));
				Scanner sc = new Scanner(System.in);
		  
				String T; //�Է� ���� ��
				T = sc.nextLine();

				int[] arr = new int[Integer.parseInt(T)]; // �Է¹��� �� �迭
				String num; // �о�� �� 
		 
				for (int i = 0; i < Integer.parseInt(T); i++) {
					num = sc.nextLine();
					//�Էµ� �� ����
					arr[i] = Integer.parseInt(num);

					//System.out.println(arr[i]);
				}
				//����
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1; j<arr.length; j++) {
						if(arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp; 
						}
					}
				}

				//������ �� ���
				for (int i = 0; i < arr.length; i++) {
					//���
					System.out.println(arr[i]);
				}
	}

}

package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1546 ���
public class Code1546 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// ���� �ִ� �� M
		// ���� �� ���� N
		// N/M*100
		
		//System.setIn(new FileInputStream("src/baekjoon/code1546"));
		Scanner sc = new Scanner(System.in);
		
		int T; //���� ��
		T = sc.nextInt();
		
		double[] arr = new double[T]; //���� ���� �迭 
		double[] arr2 = new double[T]; //���� ����� ���� �迭
		double M = arr[0]; //�ִ� ��
		double sum = 0; //���� ��
		double avg = 0; //���
		
		for(int i=0; i<T; i++) {
			//�Էµ� ���� ����			
			arr[i] = sc.nextInt();
			//�ִ� �� ���ϱ�
			if (M < arr[i])
				M = arr[i];  
		}
		 
		//���� ���� ���
		for(int i=0; i<T; i++) {
			arr2[i] =  (double) ((arr[i]/M)*100);
		}
		
		//�հ�
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		
		//���
		avg = sum/T;
		
		//���
		System.out.println(avg);
	}

}

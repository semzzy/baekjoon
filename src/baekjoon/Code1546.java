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
		System.setIn(new FileInputStream("src/baekjoon/code1546"));
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
			sum += arr2[i];
		}
		 
		//���
		avg = sum/T;
		
		//���
		System.out.println(avg);
	}
}

//���� ���
//		//��ȯ ������ ����� ���ϴ� ��(������ A,B,C�� ���)
//		//(A/M*100+B/M*100+C/M*100)/3 = (A+B+C)*100/M/3
//		Scanner sc2 = new Scanner(System.in);
//		int N = sc2.nextInt();
//		int A[] = new int[N];
//		for(int i=0; i<N; i++) {
//			A[i] = sc2.nextInt();
//		}
//		long sum2 = 0;
//		long max2 = 0;
//		for(int i=0; i<N; i++) {
//			if(A[i] > max2) max2 = A[i];
//			sum2 = sum2 + A[i];
//		}
//		//�� ����� ���õ� ������ ������ �� ���õ� �������� ��ȯ�� ������ ��������
//		System.out.println(sum2*100.0/max2/N);

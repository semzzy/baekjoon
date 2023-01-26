package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1546 평균
public class Code1546 {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// 점수 최댓 값 M
		// 과목 별 점수 N
		// N/M*100
		System.setIn(new FileInputStream("src/baekjoon/code1546"));
		Scanner sc = new Scanner(System.in);
		
		int T; //과목 수
		T = sc.nextInt();
		
		double[] arr = new double[T]; //기존 성적 배열 
		double[] arr2 = new double[T]; //새로 계산한 성적 배열
		double M = arr[0]; //최댓 값
		double sum = 0; //성적 합
		double avg = 0; //평균
		 
		for(int i=0; i<T; i++) {
			//입력된 성적 저장			
			arr[i] = sc.nextInt();
			//최댓 값 구하기
			if (M < arr[i])
				M = arr[i];  
		}
		 
		//성적 새로 계산
		for(int i=0; i<T; i++) {
			arr2[i] =  (double) ((arr[i]/M)*100);
			sum += arr2[i];
		}
		 
		//평균
		avg = sum/T;
		
		//결과
		System.out.println(avg);
	}
}

//예시 답안
//		//변환 점수의 평균을 구하는 식(점수가 A,B,C인 경우)
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
//		//한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단해짐
//		System.out.println(sum2*100.0/max2/N);

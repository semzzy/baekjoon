package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2750 수 정렬하기
public class Code2750 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
				//System.setIn(new FileInputStream("src/baekjoon/code2750"));
				Scanner sc = new Scanner(System.in);
		  
				String T; //입력 받은 수
				T = sc.nextLine();

				int[] arr = new int[Integer.parseInt(T)]; // 입력받은 수 배열
				String num; // 읽어온 수 
		 
				for (int i = 0; i < Integer.parseInt(T); i++) {
					num = sc.nextLine();
					//입력된 수 저장
					arr[i] = Integer.parseInt(num);

					//System.out.println(arr[i]);
				}
				//정렬
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1; j<arr.length; j++) {
						if(arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp; 
						}
					}
				}

				//정렬한 수 출력
				for (int i = 0; i < arr.length; i++) {
					//결과
					System.out.println(arr[i]);
				}
	}

}

package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11720 숫자의 합
public class Code11720 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("src/baekjoon/code11720"));
		Scanner sc = new Scanner(System.in);
  
		String T; // 과목 수
		T = sc.nextLine();

		int[] arr = new int[Integer.parseInt(T)]; // 수 배열
		String num; // 읽어온 수 
		int sum = 0; // 합계 
 
		num = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(T); i++) {
			//입력된 수 저장
			arr[i] = Integer.parseInt(num.substring(i, i+1));
		}

		//합계 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		//결과
		System.out.println(sum);
	}

}

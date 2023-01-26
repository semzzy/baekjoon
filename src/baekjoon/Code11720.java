package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11720 숫자의 합
public class Code11720 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/baekjoon/code11720"));
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

//예시 답안
//Scanner sc2 = new Scanner(System.in);
//int N = sc2.nextInt();
////입력 값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
//String sNum = sc2.next();
//char[] cNum = sNum.toCharArray();
//int sum2 = 0;
//for(int i=0; i<cNum.length; i++) {
//	sum2 += cNum[i] - '0'; //cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
//}
//System.out.println(sum2);
//
///* 문자열을 숫자형으로 변경하려면 아스키코드를 사용해야함.
// * 아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다.
// * 예를 들어 문자'1'은 아스키코드 값이 49이므로 문자 '1'을 숫자 1로 변환하려면 '1' - 48 또는 '1'-'0'과 같이 연산한다. */

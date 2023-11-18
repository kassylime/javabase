package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in); // system.in 받는 거 까먹지 말기
		n = sc.nextInt(); // 숫자 입력 먼저 받고 배열 만들기
		int arry[] = new int[n]; // 배열 만들 때 변수명[] n을 먼저 만들어야 배열 오류가 나지 않음

		for (int i = 0; i < n; i++) { // n만큼 숫자 받아서 배열에 넣기
			arry[i] = sc.nextInt();
		}

		Arrays.sort(arry); // 자바 컬렉션 사용하기 sort()
		for (int i = 0; i < n; i++) // n만큼 반복해서 값 출력하기
			System.out.println(arry[i]); // i값 넣어주기
		sc.close();
	}
}

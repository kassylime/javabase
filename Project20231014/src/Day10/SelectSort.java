package Day10;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		
		// 1. 선택 정렬 selection sort
		// 맨 앞의 인덱스부터 차례대로 값을 확인해 나가는 알고리즘
		// 하나의 값을 n이라고 했을 때, n과 n의 앞에 있는 n+1을 비교하며 조건이 만족함에 따라 서로의 위치를 교체하는 방식
		
		// 장점 : 쉽게 구현할 수 있는 알고리즘 형태
		// 단점 : 데이터의 양에 따라서 시간이 증가
		
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		// 배열의 길이만큼 반복을 진행
		for(int i = 0; i < n; i++){
			// i 다음 값의 위치를 j로 표현
			for(int j = i + 1; j < n; j++) {
				if(array[i] > array[j]) {
					int temp = array[i]; // 임시 데이터 생성
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);			
		}	
		sc.close();
	}

}

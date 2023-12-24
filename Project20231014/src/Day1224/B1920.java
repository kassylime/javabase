package Day1224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i]= sc.nextInt();
//		}
//		
//		int M = sc.nextInt();
//		int[] arr2 = new int[M];
//		for(int i = 0; i < M; i++) {
//			arr2[i]=sc.nextInt();
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			int in = Arrays.binarySearch(arr, num);
			
			if(in < 0) {
				sb.append(0 + "\n");
			} else {
				sb.append(1 + "\n");
			}
		}
		
		System.out.println(sb);
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		HashSet<Integer> A = new HashSet<Integer>();
//		for(int i = 0; i < N; i++) {
//			A.add(Integer.parseInt(st.nextToken()));
//		}
//
//		int M = Integer.parseInt(br.readLine());
//		st = new StringTokenizer(br.readLine());
//		// 입력한 값과 배열 A의 값을 비교해 A에 그 값이 있으면 1, 없으면 0을 저장
//		HashSet<Integer> input_datas = new HashSet<Integer>();
//		// 결과에 대한 출력을 진행하기 위한 스트링 빌더 추가
//		// 리스트나 다른 자료구조에 저장하고 출력을 진행해도 된다.
//		StringBuilder sb = new StringBuilder();
////		ArrayList<Integer> result = new ArrayList<Integer>();
//		for(int i = 0; i < M; i++) {
//			int value = Integer.parseInt(st.nextToken());
//			if(A.contains(value)) {
//				sb.append("1\n");
//				// result.add(1);
//			} else {
//				sb.append("0\n");
//				// result.add(0);
//			}
//		}
//		System.out.println(sb);
//		
//		
////		for(Integer interger : result) {
////			System.out.println(interger);
////		}
////		
		br.close();
	}

}

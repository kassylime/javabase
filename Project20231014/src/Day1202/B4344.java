package Day1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] arr;
//        int testcase = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//
//        for(int i = 0 ; i < testcase ; i++) {
//
//            st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
//
//            int n = Integer.parseInt(st.nextToken());	//학생 수
//            arr = new int[n];
//            double sum = 0;	// 성적 누적 합 변수
//
//            // 성적 입력부분
//            for(int j = 0 ; j < n ; j++) {
//                int val = Integer.parseInt(st.nextToken());	// 성적 저장
//                arr[j] = val;
//                sum += val;	// 성적 누적 합
//            }
//
//            double mean = (sum / n) ;
//            double count = 0; // 평균 넘는 학생 수 변수
//
//            // 평균 넘는 학생 비율 찾기
//            for(int j = 0 ; j < n ; j++) {
//                if(arr[j] > mean) {
//                    count++;
//                }
//            }
//
//            System.out.printf("%.3f%%\n",(count/n)*100);
//
//        }
//    }
//	
//}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 테스트 케이스 수
        int num = Integer.parseInt(st.nextToken());

        int[] arr;

        // 케이스마다 학생수 n이 주어지고 n명의 점수 입력
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            float sum = 0;
            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[j] = value;
                sum += value;
            }

            float avg = sum / N;
            float count = 0;
            
            for (int k = 0; k < N; k++) {
                if (arr[k] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / N) * 100); 
        }
        
    }
}
//int sum = 0;
//
//int[] c = new int[num];
//for(int i = 1; 1 < num; i++) {
//	st = new StringTokenizer(br.readLine());
//	int j = Integer.parseInt(st.nextToken());
//	for(int i1 = 0; i1 < j; i1++) {
//		int k = Integer.parseInt(st.nextToken());
//		sum = k;
//		++sum;
//	}
//	System.out.println(sum/j);
//}
//

package Day1126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 2; i <= N; i++) {
//        	if(N % i == 0) {
//                System.out.println(i);
//                N = N / i;
//                i--;
//            }
//           
//        }
//
//        sc.close();
//    }

	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder(); // 대용량 
	
	int N = Integer.parseInt(br.readLine());
	int prime = 2;
	
	// N이 1이 아닐 동안 반복을 진행합니다.
	while(N != 1) {
		if(N % prime == 0) {
			N /= prime;
//			System.out.println(prime);
			sb.append(prime + "\n");
		} else {
			prime++; // prime + 1
		}
	}
	System.out.println(sb);
	br.close();
	}
}

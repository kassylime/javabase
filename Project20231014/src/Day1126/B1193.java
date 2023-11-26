package Day1126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 짝수 : 대각선 칸의 개수가 홀수인 경우
// 홀수 : 대각선 칸의 개수가 짝수인 경우
public class B1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		int diagonal_count = 1;
		int current_sum = 0;

		while (true) {
			if (X <= diagonal_count + current_sum) {
				if (diagonal_count % 2 == 1) {
					System.out.println((diagonal_count - (X - current_sum - 1)) + "/" + (X - current_sum));
					break;
				} else {
					System.out.println((X - current_sum) + "/" + (diagonal_count - (X - current_sum - 1)));
					break;
				}
			} else {
				current_sum += diagonal_count;
				diagonal_count++;
			}
		}

		br.close();
	}

}

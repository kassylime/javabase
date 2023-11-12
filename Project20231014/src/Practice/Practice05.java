// Day07
package Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice05 {

	// 컴퓨터와 가위바위보 게임을 진행
	// 플레이는 사용자부터 진행
	// 사용자가 입력한 값이 "그만"일 경우 게임 종료
	// 사용자가 낸 값에 따라서 가위, 바위, 보 승패를 결정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		Random random = new Random();

		// 플레이어 입력
		while (true) {
			System.out.print("가위, 바위, 보 값을 입력하세요. >>");
			String player = sc.next();
			// 종료조건
			if (player.equals("그만")) {
				System.out.println("종료");
				break;
			}

			// 컴퓨터의 램던 선택
			int ai = random.nextInt(3);
			System.out.println("플레이어 : " + player);
			System.out.println("컴퓨터 : " + str[ai]);

			// 결과에 따른 게임 처리
			if (player.equals(str[ai])) {
				System.out.println("무승부");
			} else {
				// 플레이어가 가위일 경우
				if (player.equals(str[0])) {
					if (ai == 1) {
						System.out.println("패배");
					} else if (ai == 2) {
						System.out.println("승리");
					}
				}

				// 플레이어가 바위일 경우
				else if (player.equals(str[1])) {
					if (ai == 2) {
						System.out.println("패배");
					} else if (ai == 0) {
						System.out.println("승리");
					}
				}

				// 플레이어가 보일 경우
				else if (player.equals(str[2])) {
					if (ai == 0) {
						System.out.println("패배");
					} else if (ai == 1) {
						System.out.println("승리");
					}
				}

			}

		}
		sc.close();
	}
}

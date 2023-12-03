package Day1202;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example02 {
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 20;
		int count = 0;
		int num = 0;

		while (true) {
			try {
				System.out.print("1 ~ 100 사이 숫자 입력 >> ");
				num = sc.nextInt();
				count++;
				if (num < N) {
					System.out.println("UP!");
				} else if (num > N) {
					System.out.println("DOWN!");
				} else {
					System.out.println("정답!");
					System.out.println("시도횟수 : " + count);
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닌 값입니다!. 다시 입력을 진행해주세요.");
				sc.next();
			}
			
		}
		sc.close();
	}

}

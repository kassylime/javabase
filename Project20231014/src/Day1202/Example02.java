package Day1202;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 20;
		
		
		try {
			System.out.print("1 ~ 100 사이 숫자 입력 >> ");
			int num = sc.nextInt();
			if(num < N) {
				System.out.println("UP!");
			} if(num > N) {
				System.out.println("DOWN!");
			}
			else if(num == N) {
				System.out.println("정답!");	
				//System.out.println("시도횟수 : " + );
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("숫자가 아닌 값입니다!. 다시 입력을 진행해주세요.");
		}
		
	}

}

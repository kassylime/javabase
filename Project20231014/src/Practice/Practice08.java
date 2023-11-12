// Day09, 백준 2798

package Practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, m;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		// 카드 3개의 합
		int sum = 0;
		
		// 새로운 근사치가 나올 때마다 이전의 값과 바꿔줄 변수이나 정답결과
		int blackjack = 0;
		
		// 입력한 숫자만큼의 카드를 입력하기 위해 필요한 데이터 생성
		int[] card = new int[n];
		
		// 배열의 갯수만큼 수자를 입력
		for(int i = 0;  i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		
		// 카드 수만큼 반복을 진행
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					sum = card[i] + card[j] + card[k];
					
					// 현재 저장하고 있는 정답이 숫자의 합보다 작으면서, 딜러가 선언한 m과 같거나 작은 경우에 근사치 변경
					if(blackjack < sum && sum <= m) {
						blackjack = sum;
						System.out.println("선택된 패 = " + i);
						System.out.println("선택된 패 = " + j);
						System.out.println("선택된 패 = " + k);
						System.out.println("현재 근사치 = " + blackjack);
						
					}
				}
			}
		}
		
		System.out.println(blackjack);
	}

}

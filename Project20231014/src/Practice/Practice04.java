// Day07
package Practice;

public class Practice04 {

	public static void main(String[] args) {
		// 반복문을 이용해서 369게임을 구현
		// 숫자는 1부터 99까지의 작업으로 진행
		// 3, 6, 9가 나올경우 숫자대신 "박수"가 출력되는 게임

		int div, left;

		for (int i = 1; i < 100; i++) {

			// 몫과 나머지가 모두 1이상으로 체크(몫이 0보다 크려면 10을 넘어야 함)
			div = i / 10;
			left = i % 10; // 2자리 수 이상에서의 겹침을 의도
							// 몫이 3의 배수, 나머지 값도 3의 배수에 해당하는 경우
			if (div > 0 && left > 0 && div % 3 == 0 && left % 3 == 0) {
				System.out.println("박수박수 ");
				// 몫이 3의 배수인 경우
			} else if (div > 0 && div % 3 == 0) {
				System.out.println("박수 ");
				// 나머지가 3의 배수인 경우
			} else if (left > 0 && left % 3 == 0) {
				System.out.println("박수 ");
			} else {
				System.out.println(i + " ");
			}
		}
	}
}

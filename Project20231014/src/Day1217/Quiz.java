package Day1217;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz extends Thread {

	Scanner sc = new Scanner(System.in);
	String question[][] = new String[5][5];
	
	public Quiz() {
		
		int result;
		question[0][0] = "대한민국의 수도는?";
		question[0][1] = "서울";
		question[1][0] = "온도를 나타내는 단위 °F의 이름은? 00온도, 앞에 두 글자만 작성해 주세요.";
		question[1][1] = "화씨";
		question[2][0] = "백조의 호수를 작곡한 차이코프스키는 어느 나라 사람인가요?";
		question[2][1] = "러시아";
		question[3][0] = "영화관에서 오전 첫 상영하는 영화는? 00영화, 앞에 두 글자만 작성해 주세요";
		question[3][1] = "조조";
		question[4][0] = "'화가 바뀌어 오히려 복이 된다'라는 사자성어는?";
		question[4][1] = "전화위복";
		question[5][0] = "어린이보호구역에서의 제한 속도는 몇 km일까요? km를 붙여서 작성해 주세요.";
		question[5][1] = "30km";
		
	}

	@Override
	public void run() {
		System.out.println("문제 시작");
		while (true) {
			try {
				for (int i = 0; i < question.length; i++) {
					System.out.printf("문제 %d번");
				}

			} catch (InputMismatchException e) {
				System.out.println("땡!");
			}
		}

	}
}

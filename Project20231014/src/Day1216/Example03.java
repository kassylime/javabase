package Day1216;

import java.util.Scanner;

public class Example03 {
	static Scanner sc;
	public static void main(String[] args) {
		
		CharacterSetting();

	}
	// 캐릭터의 기능을 설정하는 도구
	private static void CharacterSetting() {
		sc = new Scanner(System.in);
		System.out.print("첫번째 캐릭터의 이름을 입력해주세요 >> ");
		String input_data1 = sc.next();
		System.out.print("상대방 캐릭터의 이름을 입력해주세요 >> ");
		String input_data2 = sc.next();
		Player player = new Player(input_data1, 5, 1, 0.5, 0.5, 50);
		Player other = new Player(input_data2, 5, 1, 0.5, 0.5, 30);
		ThreadSetting(player, other);
		sc.close();
	}
	
	static void ThreadSetting(Player player, Player other) {
		GameThread1 gt1 = new GameThread1(player, other);
		GameThread2 gt2 = new GameThread2(player, other);
		
		gt1.start();
		gt2.start();
	}

}

package Day1216;

public class GameThread1 extends Thread {
	Player player;
	Player other;
	
	// 플레이어와 상대방을 통해 생성자 alt + shift + s + o
	public GameThread1(Player player, Player other) {
		super();
		this.player = player;
		this.other = other;
	}

	// 스레드 동작에 대한 오버라이딩 진행, alt + shift + s + v
	@Override
	public void run() {
		
		int attack_rate;
		
		boolean end = false;
		while(true) {
			try {
				sleep(1000);
				
				attack_rate = (int)(Math.random() * 2);
				
				switch(attack_rate) {
				
				case 0 : 
					System.out.printf("%s에게 %s%.1f%s만큼의 데미지를 주었습니다.(Melee)%n", other.name, "\u001B[32m", player.Melee_Attack(), "\u001B[0m");
					end = other.setDamate(player.Melee_Attack());
					break;
				case 1 :  
					System.out.printf("%s에게 %s%.1f%s만큼의 데미지를 주었습니다.(Energy)%n", other.name, "\u001B[32m", player.Energy_Attack(), "\u001B[0m");
					end = other.setDamate(player.Energy_Attack());
					break;
				}
				
				if(end) {
					System.exit(0);
				}
			} catch(InterruptedException e) {
				
			}
		}
	}

	
}

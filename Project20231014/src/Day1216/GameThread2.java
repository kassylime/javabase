package Day1216;

public class GameThread2 extends Thread {
	Player player;
	Player other;
	
	public GameThread2(Player player, Player other) {
		super();
		this.player = player;
		this.other = other;
	}
	
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
					System.out.printf("%s에게 %s%.1f%s만큼의 데미지를 주었습니다.(Melee)%n", 
							player.name,  "\u001B[37m", other.Melee_Attack(), "\u001B[0m");
					end = player.setDamate(other.Melee_Attack());
					break;
				case 1 :  
					System.out.printf("%s에게 %s만큼의 데미지를 주었습니다.(Melee)%n", 
							player.name, FontColor.ColorConsole(FontColor.ANSI_RED, other.Melee_Attack()));
					end = player.setDamate(other.Energy_Attack());
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

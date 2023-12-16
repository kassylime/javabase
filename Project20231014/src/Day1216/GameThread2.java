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
				case 0 : end = other.setDamate(player.Melee_Attack());
					break;
				case 1 :  end = other.setDamate(player.Energy_Attack());
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

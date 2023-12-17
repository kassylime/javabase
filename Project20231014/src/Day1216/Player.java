package Day1216;

public class Player extends Unit implements GameAction {
	// 부모 클래스를 이용한 생성자 
	// 인터페이스 오버라이딩
	// 부모쪽에서 생성자를 안 만들었고, 필드도 protected로 전달한 상황이므로 직접 작성해야 한다.
	
	public Player(String name, int melee, int energy, double m_hit, double e_hit, int hp) {
		this.name = name;
		this.melee = melee;
		this.energy = energy;
		this.m_hit = m_hit;
		this.e_hit = e_hit;
		this.hp = hp;
	}
	// alt + shift + s + v
	@Override
	public double Melee_Attack() {
		// TODO Auto-generated method stub
		return melee * m_hit;
	}

	@Override
	public double Energy_Attack() {
		// TODO Auto-generated method stub
		return energy * e_hit;
	}

	@Override
	public boolean setDamate(double dmg) {
		if(hp > dmg) {
			hp -= dmg;
			System.out.printf("%s의 남는 체력 : %d%n", name, hp);
			return false;
		} else {
			System.out.printf("%s가 스려졌다!%n", name);
			return true;
		}
		
	}
}

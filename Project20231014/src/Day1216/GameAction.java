package Day1216;

// 게임에서 캐릭터가 구현할 동작, 데이미지에 대한 인터페이스
public interface GameAction {
	double Melee_Attack();
	double Energy_Attack();
	boolean setDamate(double dmg);
}

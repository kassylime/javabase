package Day1216;


// 게임에서 사용할 캐릭터의 기본적인 특성을 정의하는 추상 클래스
public abstract class Unit {
	// 이름, 근거리, 물리, 물리 명중률, 마법명중률, 체력
	protected String name;
	protected int melee;
	protected int energy;
	protected double m_hit;
	protected double e_hit;
	protected int hp;
}

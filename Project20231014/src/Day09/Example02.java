package Day09;

abstract class Food{
	public abstract void FoodInfo();
}

class Fruit {
	// public void FruitInfo();
	// 메소드는 {} 영역에서 구현해줘야 되며, 일반적으로는 선언만 하는 것은 불가능
}

class Instance extends Food{
	@Override
	public void FoodInfo() {
		System.out.println("인스턴스 식품");	
	}	
}

class Bread extends Food{
	@Override
	public void FoodInfo() {
		System.out.println("맛있는 빵!");
	}
}

public class Example02 {

	public static void main(String[] args) {
		// abstract class 추상클래스
		// abstract 키워드가 붙은 메소드는 선언만 하는 것이 가능
		// abstract method를 1개 이상 가지고 있는 클래스를 abstract 클래스라고 부른다.
		
		
		// Food f = new Food(); 생성되지 못함, 기능이 없음
		// 추상 클래스는 자기 자신을 생성하는 것이 불가능
	    // 이유 : 메소드가 구현이 안 되어 있기 때문에
		
		// 추상클래스는 어디에 쓸까?
		// 추상 클래스를 상속받는 자식 클래스 쪽에서 선언만 해둔 메소드에 대한 재정의를 진행하는 것으로, 자식 클래스에서 사용
		
		
		// 추상 클래스의 사용 목적은?
		// 상위 개체를 통해 자식 개체를 생성하고, 추상메소드를 통해 반드시 재정의해야줘야 하는 메소드들을 사용하면서 코드를 돌려쓰는 것이 가능, 
		// 하나의 객체로 여러 개의 형태를 표현가능(다형성)
		Instance ins = new Instance();
		Food food = new Instance();
		food.FoodInfo();
		food = new Bread();
		food.FoodInfo();
		
		// 추상 클래스의 장점
		// 1. 개발 시간 감소(부모쪽에서 기능 구현을 하지 않고, 이름만 선언)
		// 2. 톡립적 개발 가능(자식 쪽에서 이름만 같으면 기능을 다르게 설계해도 문제 없음)
		// 3. 부모 클래스에서 자식 클래스의 기능을 사용할 수 있음(문법 이름이 같기 때문)
		// 4. 하나의 객체로 여러개를 표현할 수 있음.
	}
	

}

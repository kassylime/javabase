// 20231125
package Day1125;

// 내부 클래스 inner class = nested class
// 하나의 클래스 내부에 선언된 또 다른 클래스를 의미, 두 클래스가 서로 긴밀한 관계가 있거나, 하나의 클래스 또는 메소드에서만 사용되는 클래스인 경우 사용할 수 있는 기법
// 내부 클래스의 사용 장점 : 클래스가 여러 클래스와 관계를 맺지 않고, 내부에 구성하는 것으로 수정과 코드 이해가 더 편리해지는 부분, 논리적 그룹화
// 내부에 있는 클래스는 외부 클래스가 사용되지 않으면, 생성하지 하지 않으면 접근하는 것이 불가능
// 만약 내부 클래스가 private라면 캡슐화 보장도 가능
// 내부 클래스의 장점 : 크게 복잡하지 않고, 관리도 쉽다. 

// enum은 상수에 이름을 붙여 순차적으로 나열한 열거형 데이터
enum Type {
	attack, defense
}

class Creature{
	
	public int atk;
	public boolean Attackable;
	public int ability;
	public Type type;
	public void UseDog() {
		Dog dog = new Dog();
		dog.Bark();
	}
	
	private class Dog {
		void Bark() {
			System.out.println("멍멍!");
		}
	}
	
	class Cat {
		void Meow() {
			System.out.println("야옹!");
		}
	}
}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

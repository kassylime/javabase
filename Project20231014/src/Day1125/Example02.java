package Day1125;

//내부 클래스의 기본 유형
//1. instance class
//외부 클래스의 멤버 변수 선언 위치에 선언되어 있는 클래스는 인스턴스 멤버처럼 객체 생성 이후 접근할 수 있습니다.
//ex) Car c = new Car();
//    Car.Tire t = c.new Car();
//2. static calss
//static 멤버처럼 다루어지는 클래스입니다.
//해당 클래스는 외부 참조를 진행하지 않습니다.
//그래서 내부 클래스의 경우는 static으로 구현되는 경우가 많고 선호됩니다.
//사용방법 ) static class로 만든 클래스 형태의 메소드를 외부 클래스에 설계하여 그 값을 통해 접근하도록 설계
// 참고) 이 기능을 활용해 사용되는 디자인 패턴 = 싱글톤 패턴
//3. local class
//외부 클래스의 메소드 영역에서 만들어지는 클래스를 의미
//해당 기능 안에서만 사용이 가능
//지역변수와 비슷한 개념이고 클래스를 사용하고 버리는 용도로 쓰게 되며 다른 곳에서는 접근과 사용 자체가 불가능
//4. anoymous class
//단 하나의 객체를 생성하는 일회용 클래스
//클래스의 선언과 동시에 객체를 생성하는 특징을 가지고 있음.
//생성자가 따로 존재하지 않음

class Car{
	class Tire{
		public int durability;
	}
	class Engine{}
	class Machine{}
	// static class Navigate{} 생성자체가 안됨
	static class Navigate {
		public boolean onNavigate;
	} 
	// 클래스 형태의 데이터를 return하는 메소드를 만들어 전달합니다.
	Navigate getNavigate() {
		return new Navigate();
	}
	
	void MachineMethod() {
		class Machin{}
	}
	
}


public class Example02 {
	public static void main(String[] args) {
		// 일반적인 클래스를 만드는 방법
		// 클래스명 인스턴스명 = new 생성자명();
		Car car = new Car();
		
		// 내부 클래스를 생성하는 방법
		// 외부 클래스명.내부 클래스명 인스턴스명 = 외부클래스 객체.new 생성자명();
		Car.Tire tire = car.new Tire();
		// Car.Navigate na = c.new Navigate();
		
		// Car.Navigate navigate = c.getNavigate();
		System.out.println(car.getNavigate().onNavigate);
		// 메소드를 통해 클래스를 바로 생성하고 클래스 내부에 있는 값을 사용할 수 있다.
	}
}

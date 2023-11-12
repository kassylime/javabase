package Day06;

// 객체지향 프로그래밍
// 프로그램 내에서 식별이 가능한 정보(객체)에 대한 설계를 진행하고 해당 객체를 중시므로 프로그램을 완성해나가는 생성 기법 

// 필드 : 클래스 내부에서 만들어지는 변수, 객체의 상태를 표현
// 메소드 : 클래스 내부에서 만들어지는 함수, 객체의 행동을 표현

// enum은 한정된 상수를 저장하는 열거형 타입
// 프로그램 내부에서 열거하는 데이터를 표현할 때 사용
enum CoffeeBeans{
	Arabica, Robusta, Liberica
}

class CoffeeMachine{
	// 필드
	public String name; //커피이름
	public CoffeeBeans type; //커피원두
	public int spout; //커피추출구개수
	public int cup_count; //작업할 수 있는 컵 개수
	public boolean OnOff; //작동여부
	public boolean isMilk; //우유추가여부

	// 메소드
	public void Vending() {
		// 작동여부가  true  상태일 경우
		// if(OnOff)  아래와 동일한 식
		if(OnOff == true) {
			System.out.println("커피를 제작합니다!");
			System.out.println("이름 : " + name);			
			System.out.println("원두 : " + type.name());
			System.out.println("추출구개수 : " + spout);
			System.out.println("만들어진 커피 컵 개수 : " + cup_count);
		} else {
			System.out.println("커피 머신을 켜 주세요~");
		}
	}
}

public class Example02 {
	public static void main(String[] args) {
		// 클래스(class)
		// 객체를 정의하는 틀, 설계도의 역할
		// 자바에서는 파일의 단위
		// 클래스에서는 객체의 상태를 표현하기 위한 필드와 객체의 행동을 표현할 메소드로 구성
		
		// 클래스를 이용해 객체를 생성
		// 클래스명 인스턴스명 = new 클래스명();
		// 인스턴스는 클래스 형태로 만들어진 데이터를 의미(참조형 변수)
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		coffeeMachine.isMilk = false;
		coffeeMachine.OnOff = true;
		coffeeMachine.type = CoffeeBeans.Robusta;
		coffeeMachine.name = "아메리카노";
	    coffeeMachine.spout = 3;
	    coffeeMachine.cup_count = 12;
		
	    coffeeMachine.Vending();
	}
}

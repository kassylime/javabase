package Day08;

class Car{
	private int id;
	
	public void Drive() {
		System.out.println("차로 드라이브를 진행합니다.");
	}
	private void CarInfo() {
		System.out.println("자동차에 대한 정보 설계");
		System.out.println(id); // 같은 내부 클래스에서만 가능
	
	}
}

// 상속 작성 방법
// class 자식클래스명 extends 부모 클래스명 (한명의 부모)
class SuperCar extends Car{
//	public void ID_Check() {
//		System.out.println(id);
//	} 클래스 내부에서는 사용가능한게 private지만, Car 내부에서만 가능하고 물려받은 SuperCar에서는 접근이 불가늫하다. 
	
	
	// 오버라이드 : 기존에 부모 클래스에서 가지고 있던 값에 대한 재정의를 진행하는 경우
	// 기능적으로 좋으나 재정의하는 것이기 때문에 상황에 따라서 문제가 생길 수 있다.
	// 어떤 상황? 상속을 통해 만들어진 클래스, 객체는 밀접하게 결합되어 있고 기본(상위) 클래스가 만든 값은 하위 클래스 전체에 영향을 주는 중요한 값
	@Override
	public void Drive() {
		System.out.println("자동차를 빠른 속도로 드라이브합니다."); 
	}
}

// 상속은 아니지만, 클래스끼리 관련지어 작업할 수 있는 형태의 설계인 컴포지션
// 컴포지션은 클래스를 구성하는 부분의 합(구성요소)로써 클래스를 정의하는 것을 의미

class House{
	// 작업할 양이 늘어남.. 독립된 코드, 다 구현해야 함... A is B의 경우는 사용하기 어려움 이경우는 상속
	// 상속이 없더라도
	private Bathroom bathroom;
	private LivingRoom livingroom;
	private BedRoom bedroom;
	private WorkPalce workplace;
	
	// 기능을 사용 가능, 캡슐화
	public void Choice(int choice) {
		if(choice == 1) {
			bathroom.Bath();
		}
	}
}

class Bathroom{
	public void Bath() {
		System.out.println("목욕을 진행할 수 있습니다.");
	}
}
class LivingRoom{

}
class BedRoom{
	
}
class WorkPalce{
	
}



public class Examlpe02 {

	public static void main(String[] args) {
		SuperCar supercar = new SuperCar();
		supercar.Drive(); // 기존 부모가 가지고 있던 메소드 기능을 그대로 사용 가능, 상속
//  		supercar.CarInfo(); // private로 설정된 값은 자식 클래스에서 가져와서 사용하는 것이 불가능
		
		
	}

}

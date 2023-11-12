package Day08;

// A is B
// 싱속이 적합한 경우 Is A, is a kind of 관계가 형성된 경우
// An ATV is a Vehicle. (O)
// A LivingRoom is a House. (X)
// A BedRoom is a kind of House. (X)

// 컴포지션이 적합한 경우, Example02 예제
// has, is part of 관계가 형성된 경우
// DiningRoom has a House / is part of a house 집이 가지고 있다. 일부이다.

class Vehicle {
	// protected는 상속 관계까지의 접근을 허용하는 키워드
	String brand;
	String color;
	float weight;
	float speed;
	
	public void Move() {
		System.out.println("Vehicle is Moving");
	}
}

class ATV extends Vehicle {
	boolean islicense;
	String user_name;
	String type;	
}

public class Example03 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

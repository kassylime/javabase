package Day07;

class Animal {
	
	// getter & setter
	// get 함수, set 함수라고도 불림
	// get 함수 : 해당 데이터 형태를 가지는 함수로 해당 필드 값을 return 한다.
	// set 함수 :  void 형태의 데이터에 매개변수로 필드의 데이터 형태를 가지게 된다. 전달 받은 값으로 필드 값을 초기화하는 기능을 가지고 있다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;

	public void Info() {
		
	}
	
	public void Sound() {
		
	}
}

public class Example02 {

	public static void main(String[] args) {
	   Animal animal = new Animal();
	   animal.setAge(10);
	   System.out.println(animal.getAge());
	   
	   // 직접 값에 대한 작업을 하는 것으로 위의 get, set 함수를 쓰지 않고 작업하는 것이 가능
	   // 단 클래스를 구성할 때는 클래스의 속성(필드)가 공개 정보 상태인 것은 보안에 매우 취약
	   
	   //animal.age = 5;
	   //System.out.println(animal.age);
	   
	   // 따라서 클래스를 설계할 경우, 캡슐화에 대한 처리를 진행하는 것을 권장
	   // 캡슐화 : 데이터와 데이터를 처리하기 위한 알고리즘을 하나로 결합하는 것을 의미
	   // 클래스 객체에 대한 직접적인 접근을 다 막아주며, 객체가 제공해주는 필드 또는 메소드를 통해서만 접근이 가능하게 설계
	   // 장점 : 정보에 대한 은닉, 보안성 강화, 무분별한 변경 제어, 기능에 대한 범위를 최소화하는 것이 가능, 유지보수, 오류범위 최소화, 데이터가 변경되어도 다른 객체에는 영향을 주지 않음(독립성 강한 코드 설계 가능)
	   // 단점 : 정보 공유 과정 속에서 캡슐화로 인해 구조 파악이 어려워질 경우 수정 작업이 더 어려울 수 있음.
	   //       캡슐화 설계로 인해 제공할 구조가 편의성으로 짜일 경우 코드의 질이 좋지 못할 수 있음. 
	   
	   

	}

}

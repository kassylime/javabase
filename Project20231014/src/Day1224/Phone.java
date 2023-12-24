package Day1224;

public class Phone {
	// 전화 클래스의 필드
	// 필드 : 클래스 내부에 있는 변수
	// static 키워드가 붙은 변수 == 클래스 변수
	// 클래스 변수 Phone.nam과 같은 형태로 접근 가능
	// 별도의 인스턴스 생성 없이 사용이 가능한 데이터
	// static 키워가 안 붙은 변수 == 인스턴스 변수
	// Phone p = new Phone(); 와 같이 프로그램 내에서 Phone에 대한 인스턴스를 생성한 뒤 p.name과 같은 형태로 사용 가능한 데이터
	private String name;
	private String phone_number;
	private String address;
	
	// 생성자
	// 별도의 타입을 가지지 않고 클래스 이름의 형태로 만드는 메소드
	// 메소드 : 클래스 내부에 있는 함수
	// static 클래스 함수, static x 인스턴스 함수
	// this : 클래스 자신이 가지고 있는 값이라는 표현, 주로 전달받는 매개변수의 이름과 클래스 내부의 필드가 이름이 동일한 경우에 자주 사용
	// 생성자는 인스턴스를 생성할 때 호출하는 메소드
	// 생성자의 형태를 수정했을 경우, 그 형태대로 생성을 진행
	public Phone(String name, String phone_number, String address) {
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}
	
	// 매개 변수가 없는 생성자가 한 개 이상 존재해야, 클래스 인스턴스에 대한 선언이 가능
	// 이 생성자를 기본생성자라고 부르며, 따로 사용자가 생성자를 수정하지 않았을 경우 이 형태로 제공
	// 수정했을 경우만 같이 사용하고 싶을 경우만 필요하고, 수정하지 않았을 경우는 만들지 않아도 됨
	public Phone() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// 재정의, 덮어쓰기
	// 자식클래스에서 부모 클래스가 제공해준 값에 대한 재정의를 진행하는 것을 오버라이드라고 부른다.
	// 오버로드 : 같은 이름의 함수를 구현할 때 함수에 작성해주는 매개변수의 형태를 다르게 해 이름은 같지만 기능이 다른 함수를 구현하는 것을 의미
	@Override
	public String toString() {
		// 객제를 출력할 때 나오는 문구
		return "이름 : " + name + "전화번호 : " + phone_number + "주소 : " + address;
	}

	
}

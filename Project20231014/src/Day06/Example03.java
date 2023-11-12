package Day06;
// 클래스 내부에서 만들어진, 객체의 동작을 표현하는 것을 메소드라고 부르며, C언어 등에서는 명령문들의 집합 함수를 의미

// 함수 만드는 방법
// 접근제한자 자료형 함수형(메개변수) {
//	함수 호출 시 실행할 명령문;
// }

// 접근제한자 : public, private, protected 키워드
// 데이터에 대한 접근 여부를 표현
// public : 모든 위치에서 접근이 가능한 공용에 대한 표현
// private : 클래스 내부에서만 접근이 가능하다. 외부 접근 허용이 되지 않는다.
// protected : 관련성 있는 클래스(상속)까지의 접근을 허용한다.

public class Example03 {
	// 1. 인스턴스 메소드 : 클래스를 생성 후, 그 클래스 인스턴스를 통해 메소드를 호출하는 방식
	public void FuncExample() {
		//  void는 별도로 데이터가 없는 비어있는 타입
		System.out.println("Func 1 실행");
	}
	// 2. 클레스 메소드 : 클래스명.메소드명()을 통해서 클래스의 생성 없이 바로 기능을 호출해서 사용하는 방식
	public static void FuncExample2() {
		System.out.println("Func 2 실행");
	}
	
	// 클래스 메소드, return 함수
	// return은 함수를 종료하는 기능을 가진 키워드, return앞에 값을 적을 경우 함수를 호출한 위치에 그 값을 전달
	// 타입이 void인 경우에는 return을 통해 값을 전달하지 않는다.(일바함수)
	public static int DataPuls(int value) {
		return value * 2;
	}
	
	
	
	public static void main(String[] args) {
		// 메소드(함수)에 대한 이해
		// 1. 인스턴스 메스드 사용 방법 : 복제본을 사용하여 호출
		// 클래스 인스턴스를 생성하고, 인스턴스.메소드명()을 통해 호출 
		Example03 example = new Example03();
		example.FuncExample();
		
		// 2. 클래스 메소드 사용 방법 : 함수에 있는 것 그대로 가져올 때 
		Example03.FuncExample2();
		
		int value = 5;
		
		value = Example03.DataPuls(value);
		// value = example.DataPuls(value);
		System.out.println(value);
	}

}

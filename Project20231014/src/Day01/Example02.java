package Day01;

public class Example02 {

	public static void main(String[] args) {
		// 변수(variable) 
		// 하나의 데이터를 저장하기 위해 이름을 할당받은 메모리 공간
		
		// 변수를 만드는 방법
		// 데이터의 형태를 작성 후 그 다음 저장공간에 대한 이름을 작성
		
		// 데이터의 종류 2가지
		// 1. 기본 데이터 : 실제 값에 대한 표현(숫자(정수 / 실수), 논리, 문자) -> literal : 고정되어 있는 표기 값
 		// 2. 참조 데이터 : 주소 값에 대한 표현(주소값은 컴퓨터 메모리에 제공되는 별도의 저장공간), reference : 특정 공간의 위치를 전달
		
		// 기본 데이터 타입(literal)
		// 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		// 실수형 : float(4byte), double(8byte) 15자리까지 오차가 없음
		// 문자형 : char(1byte)
		// 논리형 : boolean(1byte)

		int number; // 정수형 변수 number 선언(declare), 형태만 만들어 놓음
		number = 10; // number에 10의 값을 대입(initialize), 초기화
		// = : a = b, a에 b의 값을 대입하다로 해석함, 직접 값을 넣을 때는 초기화한다고 하고, 대입
		
		System.out.println(number); // 변수 형태를 넣고 출력
		
		double pi = 3.14; // 선언과 초기화를 동시에 진행
		
		System.out.println(pi);
		
	}

}

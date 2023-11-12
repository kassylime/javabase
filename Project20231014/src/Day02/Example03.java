package Day02;

public class Example03 {

	public static void main(String[] args) {
	// 제어문 
	// 사용자가 원하는 흐름대로 명령을 진행하게 도와주는 기능
    // 제어문 활용 시에는 기본적인 연산자에 대한 이해가 필요합니다.

	// 1. if문
//	if(조건식(크기에 대한 비교)) {
//		조건식의 결과가 일치하는 경우 실행할 명령문;
//	} else { 보조문법
//		조건식의 결과가 일치하지 않을 경우 실행할 명령문;
//	}	
		
		
	int a = 5;
	if(a % 2 == 0) {
		System.out.println("a는 짝수입니다.");
	} else {
		System.out.println("a는 홀수입니다."); // T
	}
		
	// 보조문법 else if
//	if(조건식1) {
//		
//	} else if(조건식2) {
//		위의 조건식1이 틀린 상태에서, 조건식2가 일치하는 경우 실행할 명령문;
//	}
	
	
	// if를 여러 개 작성할 경우, 각각의 조건을 다 프로그램이 체크한다라는 문제점이 존재함
	int select = 1;
	if(select == 1) {
		System.out.println("수박");
	} 
	// else if를 쓰는 이유
	if(select == 2) {
		System.out.println("딸기");
	} else {
		System.out.println("파인애플");
	}
		
		
	}

}

package Day11;

import java.util.Scanner;

// 백준알고리즘 문제 재귀
public class B27433 {

	// 재귀 함수는 함수가 자기 자신을 호출하는 형태로 설계되는 함수를 의미
	// 반복문을 사용하지 않고 문제를 해결하는 설계 구조
	// 장점 : 특정 코드 기준으로 설계가 더 쉽게 이루어지는 경우가 있다.
	// 함수를 최대한 단순하게 설계해주는 것이 가면 갈수록 중요하기 때문에 재평가 되기도 함.
	// 변수를 여러 개 설계할 필요가 없어짐
	
	// 단점 : 종료 조건 미 가입 시 발생한 스택 오버플로우 현상 우려
	// 재귀 함수를 사용하는 것이 일반 반복문의 설계를 진행하는 것보다 오히려 더 헷갈리는 상황도 존재
	// 함수의 호출이 반복되는 과정이기에 일반벅으로 일반 반복문보다 느린 연산이 진행
	
	// 재귀 함수를 사용하기 적합한 경우 : 같은 형태의 문제를 더 작은 문제로 쪼개가면서 풀어야하는 풀이에 적함. 패턴화가 되어 있는 로직에 적합
	
	// 재귀함수 작성 방법
	// 1. 반드시 종료 조건을 만들어 주기!! 만들지 않으면 이론 상 무한 호출
	// 프로그램 내에서는 함수의 호출(Call Stack)에 대한 제한이 설정되어 있기 때문에 멈추게 됨.
	// 호출 시 넣어주는 값에 대해서 변경점이 있어야 한다.
	
	// 팩토리얼은? N!로 표현
	// 1부터 N까지의 곱을 의미
	
	public static int RecursiveMethod(int N) {
		if(N <= 1)
			return 1;
		return N * RecursiveMethod(N-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(RecursiveMethod(N));
		sc.close();
	}

}

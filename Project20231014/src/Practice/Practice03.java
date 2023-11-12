package Practice;

import java.util.Scanner;

public class Practice03 {
	
	public static int Add(int a, int b) {
		return a + b;
	}
	public static int Sub(int a, int b) {
		return a - b;
	}
	public static int Mul(int a, int b) {
		return a * b;
	}
	public static int Div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		// a와 b에 대한 입력 진행
		System.out.print("a를 입력하세요. a : ");
		a = sc.nextInt();
		System.out.print("b를 입력하세요. b : ");
		b = sc.nextInt();
		
		// a와 b에 대한 사칙연산을 진행할 함수를 설계해 출력합니다.
		
		
		System.out.print("a + b : ");
		System.out.println(Practice03.Add(a,b));
		System.out.print("a - b : ");
		System.out.println(Practice03.Sub(a,b));
		System.out.print("a * b : ");
		System.out.println(Practice03.Mul(a,b));
		System.out.print("a / b : ");
		System.out.println(Practice03.Div(a,b));
	
		
	}
}

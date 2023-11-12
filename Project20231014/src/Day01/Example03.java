package Day01;

import java.util.Scanner;
// java.util.Scanner; 에서 .은 위치에 대한 구분, 자바 유틸을 불러오기
//자바에서는 클래스는 많이 알고 있어야 편함. 유틸리티 도구(라이브러리)를 공부하는 것이 필요!

// 변수의 생성 규칙(이름)
// 1. 변수의 이름을 키워드를 사용할 수 없다. 기능을 가지고 있는 영단어 : new, int 등
// 2. 이름 사이에 공백을 넣을 수 없다. 
// 3. 이름 맨 처음 부분에 숫자를 사용할 수 없다. 리터럴이기 때문에 사용 불가, 값
// 4. 변수의 이름으로 특수문자 사용은 불가능하다. 단 예외 존재(_ : 원래 용도, $ : 화폐단위)

public class Example03 {

	public static void main(String[] args) {
		// 데이터 입력
		// 참조형 변수 reference Scanner
		Scanner sc = new Scanner(System.in);
		// System.out.print()는 안에 문장을 작성해 출력하는 기능, 작업 후 enter처리를 하지 않음
		System.out.print("충전할 금액을 입력해주세요 >> ");
		int value = sc.nextInt();
		System.out.println("충전한 금액은 " + value + "원입니다.");
		sc.close(); // 스캐너 반납
	}

}

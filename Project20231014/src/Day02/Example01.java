package Day02;

public class Example01 {

	public static void main(String[] args) {
			
			// String 클래스
			// 문자열(문자의 묶음)을 표현하거나, 문자에 대한 작업을 진행할 함수를 포함
			
			// String을 사용하는 방법
			// 1. String 변수명 = "적고 싶은 내용";             문자열 대입, 초기화
			// 2. String 변수명 = new String("적고 싶은 내용"); 문자열 reference 생성
			
			String s1 = "Apple";
			String s2 = new String("Apple");
			String s3 = "Apple";
			String s4 = new String("Apple");
			
			
			// 각 변수끼리 일치하는 지에 대한 여부 조사
			
			System.out.println(s1==s2); // F
			System.out.println(s1==s3); // T
			System.out.println(s2==s3); // F
			System.out.println(s2==s4); // F

			// True가 뜨는 이유
			// 문자열로 생성된 String 객체는 동일한 내용일 경우, 그 문자열을 서로 공유
			
			// false가 뜨는 이유
			// String을 new를 통해서 생성하게 될 경우, 
			// 내용이 같더라도 해당 값을 가리키고 있는 주소값이 다르기 때문에 결과가 다르게 나옴
			
			// String은 new로 인한 생성보다 문자열 대입으로 만들어주는데 더 이득
			
			
			
	}
}

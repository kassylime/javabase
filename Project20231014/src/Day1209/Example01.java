package Day1209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestException {
	public void TestNumberFormatExceptionMethod() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		System.out.println(N + ',' + M);
		br.close();
	}
	
}


public class Example01 {

	public static void main(String[] args) {
	

		// 예외처리 throw, throws
		// throw의 경우는 프로그래머가 강제로 해당 예외 상황을 발생시키는 코드
		// 사용목적 : 강제로 예외를 처리하기 위함. 여러가지 발생 가능한 예외들을 호출한 메소드에서 한번에 처리할 수 있게 해줌(throws와 연계)
		
		// throws는 try-catch처럼 예외를 처리하는 기능을 가지고 있다.
		// 예외 처리 시 상위쪽으로 미루어서 처리하는 특징을 가지고 있다.
		
		TestException te = new TestException();
		
		try {
			te.TestNumberFormatExceptionMethod();
			// throw new Exception("오류를 투척합니다.");
		} 
		catch(NumberFormatException nfe) {
			System.out.println("숫자를 제대로 입력헤야합니다.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.err.println("예외 처리를 진행합니다.");
		}
		
		
	}

}

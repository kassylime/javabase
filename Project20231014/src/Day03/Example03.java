package Day03;

public class Example03 {

	public static void main(String[] args) {
		// Array : 데이터를 묶어서 표현하는 자료구조
		// 배열 만드는 방법 
		// 1. 데이터의 값을 직접 넣어주는 방법
		// 데이터형태[] 이름 = {값1, 값2, 값3, .....};
		String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
		
		
		// 2. 길이만 설정하는 방법(많이 사용) 
		// 데이터형태[] 이름 = new 데이터형태[데이터의 길이];
		int[] numbers = new int[10];
		
		// 1. index(0부터 셈), 배열명[인덱스번호]를 통해 값을 얻을 수 있음
		System.out.println(weeks[3]);
		
		// 2. 배열의 길이 length
		System.out.println(numbers.length);
		
		// 3. ArrayIndexOutOfBoundsException 
		// 배열은 저장된 순서가 따로 존재하고, 그 범위를 이탈하는 순간 해당 오류 발생
		// 작업 시 잘못된 위치에 접근하지 않도록 설계하는 것이 기본
		// System.out.println(weeks[9]);
		
		// 4. 배열 안에 있는 값을 수정하는 방법(인덱스)
		for(int i = 0; i < 10; i++) 
			numbers[i] = i;
			
		System.out.println(numbers[8]);
		
	}

}

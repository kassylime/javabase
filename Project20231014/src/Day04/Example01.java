package Day04;

import java.util.Arrays;
import java.util.Collections;

public class Example01 {

	public static void main(String[] args) {
		// 배열 연습
		// 자바에서 제공해주는 배열 조작 기능 Arrays
		
		// 1. 배열의 크기와 값이 모두 없는 비어있는 배열
		String[] s_array01 = {};
		// 2. 배열의 크기가 존재하나, 값이 없는 비어있는 배열
		// new는 클래스 형태의 객체를 생성해 주는 역할을 가진 연산자
		String[] s_array02 = new String[3];
		// 3. 배열의 크기가 존재하고, 값도 지정되어 있는 배열 
		// 넣어준 값(요소)의 개수가 배열의 길이가 됩니다.
		String[] s_array03 = {"Apple", "Box", "Card"};
		// 4. 배열에 값을 넣어주는 방법(for문과 함께 쓸 경우에는 여러 개에 대한 작업이 가능)
//		s_array01[0] = "google";
//		s_array01[1] = "naver";
//		s_array01[2] = "daum";
		
		
		// Index 0 out of bounds for length 0 오류 발생
//		System.out.println(s_array01[0]); 

		// 크기가 정해지지 않은 상태, 순번이 없고, 값을 넣어줄 수 없다.
		// 사용하고 싶을 경우 길이를 배정해서 다시 작업을 진행해야 한다.
		s_array01 = new String[3];
		s_array01[0] = "google";
		s_array01[1] = "naver";
		s_array01[2] = "daum";
		System.out.println(s_array01[0]);
		
		
		// 배열의 특징
		// 한번 데이터가 정해지고 나면, 새로 값을 할당하는게 아니면 크기를 늘리거나, 줄이는 것이 불가능(불변 객체)
		
		// 자바의 배열 보조 도구(Arrays)
		// java.util.Arrays가 코드에 import 되어있어야 사용가능
		
		// 1. 배열 복사 기능(전체크기복사)
		// Arrays.copyOf(복사할 배열, 배열의 크기);
		s_array01 = Arrays.copyOf(s_array03, s_array03.length);
		
		for(String data : s_array01)
			System.out.print(data + " ");
		
		// 2. 배열 복사 기능(범위)
		// Arrays.copyOfRange(복사할 배열, 시작위치, 개수);
		s_array01 = Arrays.copyOfRange(s_array03, 0, 2);
		System.out.println("\n범위 복사");
		for(String data : s_array01)
			System.out.print(data + " ");

		// ☆ 3. Arrays.sort() : 배열 정렬
		int[] values = {1, 11, 98, 117, 36, 55, 24, 6, 78, 5};
		Arrays.sort(values); // 오름차순 정렬
		System.out.println("\n오름 차순 정렬");
		for(int value : values)
			System.out.print(value + " ");
		
		// 상위문법 --------------------------------------------------------------------------
		// 내림 차순 기능 : 하지만 해당 기능은 기본 데이터가 아닌 객체 상태에서만 가능
		// int -> Integer의 형태로 변경
		// Integer : int타입을 객체(클래스) 형태로 바꾼것
		// stream : 배열을 더 편리하게 가공하고 처리해주는 보조도구
		// boxed : Integer를 stream으로 바꾸는 기능
		// toArray : 어떤 형태로 변화할지 작성(Integer의 배열 형태로 변환) 
		Integer[] integer_values = Arrays.stream(values).boxed().toArray(Integer[]::new);
		Arrays.sort(integer_values,Collections.reverseOrder());
		System.out.println("\n내림 차순 정렬(숫자는 int -> Integer)");
		for(Integer value : integer_values)
			System.out.print(value + " ");
		
		
	}

}

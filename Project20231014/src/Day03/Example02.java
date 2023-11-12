package Day03;

import java.util.ArrayList;
import java.util.Arrays;

public class Example02 {

	public static void main(String[] args) {
		// 자바에서 제공해주는 데이터를 추가, 삭제할 수 있는 배열(ArrayList) : 가변 배열
		// C언어에서 데이터를 배열(Array)를 통해 표현한다면, 자바에서도 동일하게 배열을 존재함
		// 편의성의 문제로 더 개선된 ArrayList를 사용하는 경우가 빈번함
		// 데이터를 최적화하는 단계에서는 배열을 사용
		
		// ArrayList 만드는 방법
		// 1. import를 통해 ArrayList가 등록되어야 한다.
		// 2. ArrayList<데이터형태> 변수명 = new ArrayList();를 통해 생성
		
		// ArrayList에서  사용하는 데이터 형태(클래스) <E> : 프로그램의 데이터 형태
		// int -> Integer
		// char -> Character
		// 그 이외느 전부 앞글자를 대문자로 처리하면 완료 Double, Float, Boolean
		ArrayList<Integer> al = new ArrayList<>();
		
		// 1. 데이터 추가
		// al.add(1);
		// al.add(2);
		// al.add(3);
		
		for(int i = 1; i <=50; i++)
			al.add(i);
			
		// 2. 데이터 제거
		// 배열의 경우 첫번째 데이터는 0번째 값으로 해석
		// al.remove(0)
		// 삭제를 진행하면서 ArrayList에 저장된 데이터의 개수와 순번 또한 바뀜, 가변배열
		for(int i = 0; i < 25; i++) {
			al.remove(i);
		}
		
		// 3. 데이터 하나에 대한 접근
		// (1) Enhanced for문 (배열의 형태에서 하나하나의 값의 개수만큼 반복 처리 for문)
		// Enhanced for문 작성방법
		// for(묶음이 가진 하나의 데이터 형태 이름 : 묶음){}
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		System.out.println("=====================");
		
		// (2) 일반 for문
		// size()를 이용해 ArrayList의 전체 데이터 개수(길이)를 쉽게 표현
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			// get(인덱스번호)를 통해 해당 위치에 있는 값을 접근할 수 있다.
			// 인덱스 : 배열에서 데이터를 저장하고 있는 위치
			// 숫자는 0부터 배열의 개수 -1까지 주어진다.		
		}
		
		System.out.println(al);
		
		// 4. 해당 데이터가 리스트 안에 존재하는지에 대한 여부 체크
		// Arrays.asList(값1, 값2, 값3, .....)는 ArrayList를 만들 때 추가할 데이터를 넣어주는 문법
		ArrayList<String> bag = new ArrayList(Arrays.asList("사과", "멜론", "딸기"));
		
		// 데이터베이스에서는 where
		if(bag.contains("바나나")) {
			System.out.println("그 바나나와 내 멜론과 바꾸지 않을래?");
		} else {
			System.out.println("바나나 없어?");
		}
		
		
	}

}

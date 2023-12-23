package Day1223;

import java.util.HashSet;
import java.util.Iterator;

// HaseSet : 해시 알고리즘을 기반으로 설계된 Set
// Hash Algorithm : 긴 길이의 데이터를 짧은 길이의 데이터로 변환하는 알고리즘, 
// 제 3자의 경우 짧은 길이의 데이터를 통해 원래의 데이터를 복구할 수 없으며
// 동일한 출력 결과를 가지고 있는 서로 다른 데이터를 찾을 수 없도록 설계

// 해시 코드 : 해시 알고리즘에 의해 생성된 정수의 값
// 해시 코드는 애클리케이션이 실행되는 동안 그 객체에게 고유의 번호를 제공하고 그 번호는 몇 번을 호출해도 항상 같은 값을 받아옴
// 자바에서 데이터의 값이 같음을 비교하는 equals를 통해서 그 결과가 같다일 경우 비교한 각각의 값은 hashcode가 동일
// >> 값을 구분하기 위한 고유 데이터(정수)

// 해시 알고리즘 간단 이론
// 1. 사용자가 만든 키를 해시 코드로 변환
// 2. 해시 코드를 인덱스로 가지는 buckets 배열에 해당 인덱스를 찾아서 저장
// 이때 배열의 길이가 초과되는 경우라면 길이의 나머지를 구해서 LinkedList로 추가 연결을 진행
// >> 사용하는 값을 고유코드로 바꿔서 내부의 데이터에 그 고유코드 번호 위치로 저장


public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hashset = new HashSet();
		// Integer는 int 그 자체를 클래스화한 클래스입니다.(Wrapper Class)
		// 해시셋을 이용한 간단한 예제
	
		HashSet<String> animalSet = new HashSet();
	
		// add로 값 추가, 내부가 같은 값이 있다면 추가 X, 중복 허용 X
		animalSet.add("사자");
		animalSet.add("돼지");
		animalSet.add("토끼");
		animalSet.add("사슴");
		animalSet.add("토끼");
		
		// 해시셋에서 값을 제거할 때, 값 그 자체를 작성해 제거
		// 해시셋 내부에 그 값이 존재하면 값을 제거, 값이 없다면 제거 X
		// remove대신 clear를 사용할 경우 전체제거
		animalSet.remove("사슴");
		
		// animalSet.clear();
		System.out.println(animalSet);
		
		if(animalSet.contains("사자")) {
			System.out.println("사자가 산 속에 앉아 있습니다.");
		}
		
		// 해시셋 전체 출력 시 [] 없이 뽑는 방법
		// 데이터 형태에 맞는 반복자 iterator를 통해 정보를 전달해 주고 그 순서대로 출력하는 방식
		Iterator<String> iter = animalSet.iterator(); 
		// 반복자에 다음 데이터가 존재하는 경우
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 반복자의 원리
		// 1. 자료구조의 iterator()함수를 통해 정보를 전달 받음
		// 2. next()를 통해 전달받은 정보를 받은 순서대로 출력 1개, 그 데이터 다음 데이터가 맨 앞으로 오도록 설정
		// 3. 조건에 있는 hasNext()는 다음 값이 존재하는 지를 판단, 있으면 작업진행, 없으면 작업종료
		
		
		// 반복자란?
		// 자료구조의 정보를 받아서 그 받은 데이터의 순서대로 값을 보관하고 전체 객체를 대상으로 
		// 한번씩 반복해서 값을 가져올 수 있는 도구, 자바 내부의 자료구조라면 이 반복자의 형태로 정보를 전달할 수 있고,
		// 이렇게 할 경우 출력 문장에 대한 코드를 통일할 수 있다.
	}

}

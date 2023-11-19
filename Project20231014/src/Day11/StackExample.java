package Day11;

import java.util.Stack;

// 자료구조는? 데이터를 묶어서 관리하고, 그 데이터에 대한 처리 기능을 포함하고 있는 것들을 지칭하는 말

// 자료구조 stack
// 쌓는다. 더미의 뜻, 데이터는 쌓아놓는 형태의 자료구조를 의미
// 특징 : LIFO(Last In First Out) 후입선출
// 재귀 함수에 대한 호출을 할 때 사용하는 데이터
// 깉이 우선 탐색(DFS) 알고리즘에서 사용되는 데이터
// 시스템 해킹 분야에서 버퍼 오버 플로우 관련 취약점 공격 시 진행하는 위치
// 인터럽트, 수식 계산, 서브 루틴 복귀 등에서 사용되는 데이터

public class StackExample {

	public static void main(String[] args) {
		// stack<T> 스택이름 = new Stack();
		// T 부분에는 타입 작성 int => Integer, Char => Character
		Stack<String> stack = new Stack();

		stack.push("apple");
		stack.push("pear");
		stack.push("banana");

		System.out.println(stack);
		// peek 맨 위값
		System.out.println(stack.peek());
		// pop 맨 위에 값을 return 하고 그 값을 제거
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("스택의 크기 : " + stack.size());
		// 스택이 보유하고 있는 데이터의 저장 공간의 데이터 개수를 표현, 길이를 나타냄
		System.out.println("스택의 용량 : " + stack.capacity());
		// 스택이 데이터를 보관할 수 있는 용량에 대한 표현을 지행
		// 용량은 일정 기준으로 제공되며, 데이터의 개수가 늘어나면 그만큼 여유공간을 더 확보(추가, 삭제를 용이하게 하려고)
		// 실제 스택의 크기와 차이가 나고, 크기보다 용량이 더 크다.
		System.out.println("스택이 비어있는지? : " + stack.empty());
		// 스택이 비어있는지 판단하는 boolean 형태의 함수, 비어있으면 true, 아니면 false
		System.out.println("스택에 배가 포함되어 있는지? : " + stack.contains("pear"));
		// 스택 내부에서 특정 값을 검색하는 욛도로 사용
	}

}

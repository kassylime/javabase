package Practice;

import java.util.Scanner;

// 인터페이스를 통해서 자료구조 stack을 연출해보는 문제

interface Stack{ 
	public abstract int length(); // 현재 스택 내에 저장되어 있는 데이터 묶음의 데이터 개수를 리턴하는 용도
	public abstract int capacity(); // 스택 내에서 저장이 가능한 데이터의 개수에 대한 리턴을 진행
	public abstract String pop(); // 스택에 저장되어 있는 맨 마지막 값을 제거합니다. (마지막 값이 return 됩니다.)
	boolean push(String value); // 입력 받은 데이터를 데이터의 맨 위에 넣어줍니다.
}

class StringStack implements Stack {

	private int capacity; // 저장 가능한 데이터 개수
	private int idx; // 저장 가능한 인덱스
	private String[] stack; // 문자열에 대한 저장(스택)
	
	
	public StringStack(int number) {
		this.capacity = number; // 저장 가능한 데이터 개수
		this.stack = new String[capacity]; // 문자열에 대한 저장
		this.idx = 0; // 인덱스 초기화
		
	}

	@Override
	public int length() {
		// 데이터가 저장되어 있는 수치(인덱스)를 표현합니다.
		return idx;
	}

	@Override
	public int capacity() {
		// 데이터의 길이를 표현
		return capacity;
	}

	@Override
	public String pop() {
		// 스택 데이터에 값이 없는 경우에는 null 값 return
		// 일반적인 경우에는 인덱스를 1 감소
		// 변경한 인덱스 위치에 해당하는 값을 return
		
		if(idx == 0) {
			return null;
		}
		idx--;
		return stack[idx];
		
		/*
		 * if(idx - 1 < 0) { return null; } 
		 * idx--; 
		 * String data = stack[idx]; 
		 * return data;
		 */
		
	}

	@Override
	public boolean push(String value) {
		// 인덱스가 저장 개수보다 작을 경우에 그 위치에 전달받은 value를 넣어준다.
		// 인덱스를 하나 증가
		// true를 return 그게 아니면 false return
		
		if(idx < capacity) {
			stack[idx] = value;
			idx++;
			return true;
		}
		return false;
	}
	
}

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기를 입력해 주세요>> ");
		int number = sc.nextInt();
		StringStack stack = new StringStack(number);
		
		while(true) {
			System.out.println("문자열을 입력해 주세요>> ");
			String date = sc.next();
			if(date.equals("STOP"))
				break;
			if(!stack.push(date))
				System.out.println("스택 저장 공간이 가득 찼습니다!");
		}
		
		System.out.println("== 스택에 저장되어 있는 모든 문자열에 대한 POP() 진행 ==");
		System.out.println("작업 문자열 : ");
		int length = stack.length();		
		for(int i = 0 ; i < length; i++)
		{
			String pop = stack.pop();
			System.out.print(pop + " ");
		}
		
		sc.close();

	}

}

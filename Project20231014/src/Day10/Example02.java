package Day10;

import java.util.Scanner;

// 1. 인터페이스 정의
interface Sort {
	public abstract void asceding(int arry[]);

	public abstract void descending(int arry[]);

	public abstract void description();
}

// 해당 인터페이스를 구현하는 implements 클래스 설계
class QuickSort implements Sort {

	@Override
	public void asceding(int[] arry) {
		System.out.println("QuickSort ascending");

	}

	@Override
	public void descending(int[] arry) {
		System.out.println("QuickSort descending");

	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("QuickSort입니다.");
	}
}

class HeapSort implements Sort {

	@Override
	public void asceding(int[] arry) {
		System.out.println("HeapSort ascending");

	}

	@Override
	public void descending(int[] arry) {
		System.out.println("HeapSort descending");


	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("HeapSort입니다.");

	}
}

class BubbleSort implements Sort {

	@Override
	public void asceding(int[] arry) {
		System.out.println("BubbleSort asceding");
	}

	@Override
	public void descending(int[] arry) {
		System.out.println("BubbleSort descending");

	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("BubbleSort입니다.");

	}
}

public class Example02 {

	public static void main(String[] args) {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");

		Scanner sc = new Scanner(System.in);
		String select = sc.next();
		Sort sort = null;  //인터페이스 선언(선택한 값에 따라 그 형태로 생성)
		
		switch (select) {
		case "B" : 
		case "b" :
			sort = new BubbleSort();
			break;
		case "Q" : 
		case "q" : 
			sort = new QuickSort();
			break;
		case "H" : 
		case "h" : 
			sort = new HeapSort();
		}

		
		//배열 데이터 집어넣고 기능 출력
		int[] tester = new int[3];
		sort.asceding(tester);
		sort.descending(tester);
		sort.description();
		
		
		
		sc.close();
	}

}

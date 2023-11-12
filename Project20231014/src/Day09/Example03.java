package Day09;

// 1. abstract class에는 abstract method 뿐 아니라 일반적인 필드나 메소드도 존재
// 2. abstract class에서 abstract 처리가 안된 값들은 사실 상 물려받는 자식 클래스에서 
// 더 추가로 개발할 필요가 없는 완전한 값임을 명시한 것이기도 한다.
abstract class OddDector{
	protected int n;
	public OddDector(int n) {
		this.n = n;
	}
	
	public abstract boolean isOdd(); // 홀수일 경우 true를 return 해 주세요.
}

class B extends OddDector{
	public B(int n) {
		super(n); // 부모의 값을 그대로 사용하는 것을 의미
	}

	@Override
	public boolean isOdd() {
		if(n % 2 == 0)
		return false;
		return true;
	}

}

public class Example03 {

	public static void main(String[] args) {
		// 위의 abstract class OddDector를 상속 받는 클래스 B를 완성하시오.
		B b = new B(10);
		System.out.println(b.isOdd()); // false
	}

}

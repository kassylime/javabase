package Day10;


//인터페이스 만드는 방법

interface 인터페이스명{
 public static final int A = 10;
 //1. 상수에 대한 표현(public static final 키워드가 붙은 자료형)

 public abstract void Method();
 //추상 메소드에 대한 표현
}



// 인터페이스 연결 방법
interface Animal {
	public abstract void Move();
	public abstract void Eat();
	public abstract void Sound();
}

//class 클래스명 implements 인터페이스명
class Dog implements Animal {

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Example01 {

	public static void main(String[] args) {
		

	}

}

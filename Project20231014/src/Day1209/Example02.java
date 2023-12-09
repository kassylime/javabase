package Day1209;

class ExhaustVespeneGasException extends Exception {

	public ExhaustVespeneGasException() {
		super();
		// 부모 클래스의 형태로 메소드(생성자)를 호출합니다.
	}

	public ExhaustVespeneGasException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class SCV {
	public void GasGain(CommandCenter center, VespeneGas gasObject) throws ExhaustVespeneGasException {
		
		if(gasObject.gas > 0) { 
			center.gas += 8;
			gasObject.gas -= 8;	
			System.out.println("채집을 진행합니다. (+8)");
		} else if (gasObject.gas == 0) {
			center.gas += 1;
			System.out.println("고갈되어 극 소량의 가스를 채쥐하였습니다. (+1)");
		} else if (gasObject.gas < 1) {
			//gasObject.gas = 0;
			throw new ExhaustVespeneGasException("베스핀 가스가 고갈되었습니다.");
		} 
	}
}

class CommandCenter {
	public int mineral;
	public int gas;
	
	public void CenterInfo() {
		System.out.println("미네랄 양 : " + mineral);
		System.out.println("가스의 양 : " + gas);
		
	}
}


class VespeneGas{
	public int gas;
	public int Maxgas;
	public VespeneGas(int gas) {
		this.gas = gas;
		Maxgas = this.gas;
		
	}
	
	public void VespeneGasInfo() {
		if(gas > 0) {
			System.out.println("가스 양 " + gas +  "/" + Maxgas);
		} else {
			System.out.println("== 베스핀 가스 고갈 ==");
		}
	}
}


public class Example02 {

	public static void main(String[] args) {
		// 예외 클래스 만들기
		// 만드는 이유 : 자바에서 제공해주는 예외 클래스만으로 다양한 종류의 예외를 표현할 수 없는 상황이 발생할 수 있기 때문
		// ex) 은행 업무 프로그램 잔고 부족 예외 상황 같은 것들
		// 사용자 정의 예외 클래스
		
		// 만드는 방법 2가지
		// 1. Exception에 대한 상속을 구현
		// 2. RuntimeException에 대한 상속으로 구현
		
		// 차이점 : 1의 경우 컴파일러가 체크, 2의 경우 컴파일러가 체크하지 않는다.
		VespeneGas gasObject = new VespeneGas(80);
		CommandCenter center = new CommandCenter();
		SCV scv = new SCV();
		
		try {
			while (true) {
				scv.GasGain(center, gasObject);
				center.CenterInfo();
				gasObject.VespeneGasInfo();
				
				
				  if(center.gas > 100) { break; }
				 
			}
		}catch(ExhaustVespeneGasException e) {
			System.out.println(e.getMessage());
		}

	}

}

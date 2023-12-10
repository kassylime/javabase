package Day1210;
// 계좌를 생성할 때 발생할 수 있는 사용자 예외 처리 클래스
public class AccountException extends Exception {
	
	// 수업 때 만들었던 사용자 예외 처리 클래스 만드는 방법과 동일
	public AccountException(String message) {
        super(message);
    }

	public AccountException() {
		super();
		// TODO Auto-generated constructor stub
	}
}

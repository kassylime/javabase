package Day1210;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 은행업무를 수행할 클래스
// 계좌 생성, 입금, 출금 가능
public class BankApplication {

	private static List<Account> accounts = new ArrayList(); // 계정에 대한 리스트
	private static Scanner sc = new Scanner(System.in);
	
	// 메뉴를 선택할 때 발생할 예외 처리를 포함해 구현
	public int getSelect(int number) throws AccountException {
	    
		// 1~5번이 아닌 경우
		if(number < 1 && number > 5) {
			throw new AccountException("해당 메뉴는 없습니다.");
		}
		return number;
	}

	// 계좌를 생성 시 계좌 번호가 같은 경우에 대한 예외 처리를 구현
	public void ExisAnoException(Account ac, String ano) throws AccountException {
		 if(ac != null) {
			 if(ac.getAno().equals(ano)) {
				 throw new AccountException("같은 이름의 계좌가 이미 존재합니다.");
			 }
		 }
	}
	
	// 예금 또는 출금 시 금액이 부족한 상황이거나 음수 입력 시에 대한 예외처리를 진행
	// op : true(예금) / false(출금)
	public void BalanceException(Account ac, int money, boolean op) throws AccountException {
		if(money < 0) {
			throw new AccountException("잘못된 금액입니다.");
		}
		if(ac.getBalance() < money && op == false) {
			throw new AccountException("잔액이 부족합니다.");
		}
	}
	
	// 메뉴를 선택하는 메소드
	public boolean getMenu(int number) {
		switch (number) {
		case 1: 
			Create();
			return true;
		case 2:
			List();
			return true;
		case 3:
			Deposit();
			return true;
		case 4: 
			Withdrwa();
			return true;
		case 5:
			Exit();
			return false;
		default:
			return true;
		}
	}
	
	private void Withdrwa() {
		// TODO Auto-generated method stub
		
	}

	private void Deposit() {
		// TODO Auto-generated method stub
		
	}

	private void List() {
		for(int i =0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}
		
	}

	private void Create() {
		// TODO Auto-generated method stub
		
	}

	private void Exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	// 메뉴들에 대한 출력을 진행할 메소드를 자유롭게 구현
	public void MenuInfo() {
		
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 계좌생성");
        System.out.println("2. 계좌목록");
        System.out.println("3. 에금처리");
        System.out.println("4. 출금처리");
        System.out.println("5. 어플종료");
        System.out.print("메뉴를 선택하세요>>");
	}
	
	
}

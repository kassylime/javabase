package Day04;

import javax.swing.JOptionPane;

public class WhileOptionPane {

	public static void main(String[] args) {
		// swing을 통해 확인해보는 while문 예제
		
		// 1. 메뉴작성
		String menu = "=== MENU ===\n";
		menu += "1. MILKTEA 6,500원\n";
		menu += "2. GREENTEA 7,500원\n";
		menu += "3. ICEDTEA 3,500원\n";
		menu += "4. EXIT\n";
		
		// 2. 계산을 위한 변수 작성
		int sum = 0; 
		int exit = 0;
		String bill = "=== RECEIPT ===\n";
	
		// 3. 프로그램 전체 반복 while(true)
		
		while(true) {
			// Integer -> int Integer.parseInt(Object); 데이터의 형태를 int로 변환
			// showInputDialog : 화면에 메세지를 띄워주고, 아래에 입력하는 공간(input field)를 만들어 주는 기능 : Java swing
			// 입력해준 값을 숫자형태로 프로그램 내부에 전달하기 위해 int 형태로 표현
			int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "메뉴를 선택해주세요."));
			
			if(choice == 1) {
				sum += 6500;
				bill += "MILKTEA 6,500원\n";
			} else if(choice == 2) {
				sum += 7500;
				bill += "GREENTEA 7,500원\n";
			
	     	} else if(choice == 3) {
	     		sum += 3500;
				bill += "ICEDTEA 3,500원\\n";
	     	} else if(choice == 4) {
	     		exit = -1;
	     	} else {
	     		JOptionPane.showMessageDialog(null, "없는 메뉴 또는 잘못된 입력입니다.");
	     	}
			if(exit == -1) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}
		}
		// while 반복문이 끝나고 난 후에 작성
		bill += "==============\n";
		bill += "Total : " + sum + "원";
		// 넣어준 텍스트를 안내 메시지로 출력하는 문법 showMessageDialog
		// 앞 부분에는 연결되어 있는 다른 오브젝트를 작성, 일반적으로 null로 둔다.
		JOptionPane.showMessageDialog(null, bill);
	}
}

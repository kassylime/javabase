package Day1224;

import java.util.HashMap;
import java.util.Scanner;

// 상수에 이름을 붙여서 표현할 수 있는 열거형 데이터
// 일반적인 데이터와 구분하기 위해 대문자로 작성하는 경우가 많음
// 나열해서 표현해야 하는 데이터를 표현할 때 사용
enum Menu{
	INSERT, DELETE, SEARCH, ALL, EXIT
}

public class PhoneBookProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Phone> map = new HashMap();
		Menu menu = null;
		
		while(true) {
			System.out.println("============ 전화번호 관리 프로그램 ============");
			System.out.println("1.추가 2. 삭제 3. 검색 4. 전체보기 5. 종료");
			System.out.print("진행할 기능 --> ");
			int select_menu = sc.nextInt();
			
			switch(select_menu) {
			case 1: 
				menu = Menu.INSERT; break;
			case 2: 
				menu = Menu.DELETE; break;
			case 3:
				menu = Menu.SEARCH; break;
			case 4:
				menu = Menu.ALL; break;
			case 5:
				menu = Menu.EXIT; break;
			}
			
			if(menu == Menu.INSERT) {
				Insert(map);
			} else if(menu == Menu.DELETE) {
				Delete();
			} else if(menu == Menu.SEARCH) {
				Search();
			} else if(menu == Menu.ALL) {
				All();
			} else if(menu == Menu.EXIT) {
				System.out.println("프로그램을 종료하겠습니다.");
				sc.close();
				return;
			}	
		}
	}

	public static void Insert(HashMap<String, Phone> map) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 >> ");
		String input_name = sc.next();
		if(map.get(input_name) != null) {
			System.out.println("이미 존재하는 이름입니다.");
			return;
		}
		System.out.println("전화번호 >> ");
		String input_phone_number = sc.next();
		System.out.println("주소 >> ");
		String input_address = sc.next();
		
		map.put(input_name, new Phone(input_name, input_address, input_phone_number));
	}
	
	private static void Delete() {
		// TODO Auto-generated method stub
		
	}
	
	private static void Search() {
		// TODO Auto-generated method stub
		
	}

	private static void All() {
		// TODO Auto-generated method stub
		
	}
}

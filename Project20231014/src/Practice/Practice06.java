// Day07
package Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) throws IOException {
		// 프로그램 내에서 파일을 저장하고 불러오는 프로그램을 구현하시오.
		
		// 예시 ) 기능을 선택합니다. 
		// 1. 파일 생성 2. 파일 추가 작성 3. 파일 읽기 4. 종료
		
		String menu = "=== MENU ===\n";
		menu += "1. 파일 생성\n";
		menu += "2. 파일 추가 작성\n";
		menu += "3. 파일 읽기\n";
		menu += "4. 종료\n";
		 
		Scanner sc = new Scanner(System.in);
		System.out.println(menu);
		
		
		String path = "C:/text";
		String file_name = "/text.txt";
				
		while(true) {
			System.out.print("번호를 입력하세요. >>");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("1번 파일 생성");
				
				FileOutputStream makeFile = new FileOutputStream(file_name);
			} else if(choice == 2) {
				System.out.println("2번 파일 추가 작성");
	     	} else if(choice == 3) {
	     		System.out.println("3번 선택");
	     	} else if(choice == 4) {
	     		System.out.println("프로그램 종료");
	     		break;
	     	} 
		}

	}

}

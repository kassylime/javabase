// Day07
package Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class homework02 {
	public static void main(String[] args) throws IOException {
		// 프로그램 내에서 파일을 저장하고 불러오는 프로그램을 구현하시오.
		
		// 예시 ) 기능을 선택합니다. 
		// 1. 파일 생성 2. 파일 추가 작성 3. 파일 읽기 4. 종료
		
		String menu = "=== MENU ===\n";
		menu += "1. 파일 생성\n";
		menu += "2. 파일 내용 작성\n";
		menu += "3. 파일 읽기\n";
		menu += "4. 종료\n";
		 
		Scanner sc = new Scanner(System.in);
		System.out.println(menu);

		String path = "C:/text/";
		String file_name = null;
		String file_date = null;

		while (true) {
		File folder = new File(path);
		if(!folder.exists()){
			folder.mkdir();
			System.out.println("폴더 생성 완료");
		} else {
			System.out.print("번호를 입력하세요. >>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("파일 이름을 작성하세요. >>");
				file_name = sc.next();
				file_date = path + file_name + ".txt";
				FileOutputStream makeFile = new FileOutputStream(file_date);
				System.out.println(file_name + ".txt가 생성 되었습니다.");
			} else if (choice == 2) {
				if (file_date == null) {
					System.out.println("파일을 먼저 생성하세요.");
				} else {
					System.out.println("파일 내용을 작성하세요. >>");
					PrintWriter pw = new PrintWriter(new FileWriter(file_date, true));
					sc.nextLine(); 
					String file_text = sc.nextLine();
					pw.println(file_text);
					pw.close();
				}
			} else if (choice == 3) {
				if (file_date == null) {
					System.out.println("파일을 먼저 생성하세요.");
				} else {
					List<String> list = Files.readAllLines(new File(file_date).toPath());
					if (list.isEmpty()) {
						System.out.println(file_name + " 파일 내용이 없습니다.");
					} else {
						System.out.println(file_name + ".txt의 내용은 다음과 같습니다.");
						for (String readLine : list) {
							System.out.println(readLine);
						}
					}
				}
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			}
		}
	}
	
}

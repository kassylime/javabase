package Day07;

import java.io.BufferedReader;
import java.io.File;
// 파일을 밖으로 내보내는 작업을 진행할 때 사용(파일생성)
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
// 입력 출력 시 발생할 수 있는 예외시항에 대한 코드
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample01 {

	public static void main(String[] args) throws IOException {
		// 화면 밖에 파일을 만들거나, 파일을 읽어오는 기능

		// 실제 경로를 작성
		String path = "C:/text/";
		// 파일 이름 작성
		String file_name = "out.txt";
		// 폴더 만들기
		File Folder = new File(path);
		if (!Folder.exists()) {
			Folder.mkdir();
			System.out.println("폴더 생성 완료");
		} else { // 폴더가 있으면 파일 생성하기
			System.out.println("해당 폴더는 이미 존재합니다. 파일을 생성합니다.");
			// FileOutputStream output = new
			// FileOutputStream("C:/Users/Administrator/Desktop/Java10/out.txt");
			// FileOutputStream output = new FileOutputStream(path + folder_name);
			String file_date = path + file_name;
			FileOutputStream output = new FileOutputStream(file_date);

			// 파일 내용 작성하는 방법
			PrintWriter pw = new PrintWriter(file_date);
			pw.println("적고 싶은 말 작성하기");
			pw.close();

			// 추가 작성 시
			// FileWriter는 파일을 작성하는 도구로 파일의 이름과 뒤에 true를 적을 경우 그 파일을 추가 모드로 설정
			// 추가모드 (기존 데이터를 유지한 상태에서 그 다음 위치부터 작업이 진행)
			PrintWriter pw2 = new PrintWriter(new FileWriter(file_date, true));
			pw2.println("추가로 이어서 작성하기");
			pw2.print("작업을 종료합니다.");
			pw2.close();

			// 파일 읽기
			// 많은 내용을 입력을 받아야 하는 경우 Scanner보다 좋은 성능을 가지고 있다.
			// FileReader는 파일을 입력받기 위한 도구
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file_date));

			while (true) {
				// 데이터를 한 줄 단위로 읽어주는 것이 가능
				// 읽어주는 값는 무조건 String 데이터이기 때문에, 다른 타입을 입력받는 경우 형태 변환은 필수
				String line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			output.close();
		}
	}
}

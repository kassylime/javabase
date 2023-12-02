package Day1202;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderExample {
	
	// throws는 메소드 다음에 붙을 수 있는 예약어
	// 해당 예약어가 붙을 경우 이 메소드를 사용하기 위해서 어떠한 예외들이 처리되어야 하는지를 명시한다.
	// 예외사항이 발생했을 경우 따로 처리하도록 한다.
	
	public static void main(String[] args) throws IOException {
		// I/O 클래스
		// Input과 Output에 관련된 기능들이 모여있는 클래스
		// Reader / Writer : 문자(char) 단위로 입출력을 수행하는 클래스
		// Buffered ~ : 시스템의 버퍼buffer를 사용하는 클래스
		// Buffer : 임시 저장소로, 키보드가 입력한 문자 하나당 버퍼에 순서대로 전송, 버퍼가 가득 차거나 개행 문자(space, enter기능)가 버퍼에 나타날 경우 그 내용을 한 번에 프로그램 측에 전달
		
		// Scanner 클래스와의 비교
		// Scanner 클래스는 Space, Enter를 기준으로 입력 값을 인식
		// BufferedReader의 경우 Enter를 기준으로 입력 값을 인식(구분해서 나누는 작업이 추가로 필요하다)
	
		// Scanner는 사용자에게 입력에 대한 편의성을 많이 제공해 주는 클래스
		// 대표적으로 nextInt() 기능을 진행할 때 그 데이터가 바꿀 수 있는 데이터인지 아닌지 예외적인 상황이 없는지를 내부 기능을 통해 검증하는 작업이 포함된다.
		// BufferedRead는 단순히 읽기만 해서 더 빠르다
		// Scanner는 별도의 버퍼 기능이 없다.
		// 버퍼의 장점은 문자를 모아두고 통째로 전달하는 방식, 스캐너는 버퍼가 없어서 입력 과정에서 바이트 또는 문자 당 I/O를 진행해야 함
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader / OutputStream : 자바에서 가장 기본이 되는 입출력 스트림
		// Stream은 출발 지점과 도착지점을 이어주는 역할 : 데이터의 흐름
		
		// 일반적인 입력이 아닌 파일에 대한 입력을 받을 경우에는 다음과 같이 작성
		// BufferedReader br = new BufferedReader(new FileReader("파일이름.java"));
		
		String str = br.readLine();
		// 입력받은 값을 문자열에 저장
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 대량 출력 시 System.out.println 보다 효율적
		
		bw.write(str);
		
		
		// 버퍼 비우기 : close()라고 이름붙는 기능은 작업을 종료하고 메모리에서 내려주는 기능, close를 안 하면 다른 프로그램(네트워크, 파일 작업 등)에서 그 파일에 대한 엑세스르 못한다.(OS 자원 반납 개념) 
		br.close();
		bw.close();
		
		// 가비지 컬렉션 : 메모리 점유를 해제하는 내장 도구, 사용하지 않는 데이터를 해제하기 때문에 입력은 객체에 담겨 있어서 가비지 컬렉션 대상에서 제외는 경우가 있어 닫아주는 것이 좋다.잭 
	}

}

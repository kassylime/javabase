package Day02;

public class Example02 {

	public static void main(String[] args) {
		// syso, main 단축키 ctrl + space
		// 코드 한줄 복사 코드 위치에서 ctrl + alt + 방향키
		
		// 문자열이 가지고 있는 문법
		// 1. charAt(숫자) : 해당 위치에 있는 문자 하나를 return
		// 여기서의 숫자는 1이 아닌 0부터
		
		
		String word = "파인애플";
		char last = word.charAt(2); // 마지막 위치의 값을 저장
		// 자바에서는 문자 하나를 저장할 때, 한글도 가능
		System.out.println(last); // 애 출력
		
		// 2. substring(start, end)
		// 문자의 시작위치부터 마지막까지의 문자열을 return
		// 특이점은 마지막 위치 기준 -1 처리
		String word2 = "토마토 주스";
		System.out.println(word2.substring(0, 3));
		
		// 3. contains("단어") : 현재 문자열에 해당 문자열이 포함되어 있는지를 조사
		String word3 = "JAVA PROGRAMMING";
		System.out.println(word3.contains("JAVA")); // T
		System.out.println(word3.contains("java")); // F
		System.out.println(word3.contains(" "));    // T
		
		// 4. length() : 문자열의 길이
		System.out.println(word3.length()); // 16
		
	}

}

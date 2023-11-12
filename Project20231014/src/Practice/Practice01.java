package Practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
	// if문 + String 활용 연습문제
		
	// 1. 
	// 사용자는 아이디를 입력합니다. 
	// 사용자는 비밀번호를 입력합니다.
	// 사용자가 입력한 아이디가 저장한 아이디와 다를 경우 아이디가 틀렸습니다.를 출력
	// 사용자가 입력한 비밀번호가 저장된 비밀번호와 다를 경우 비밀번호가 틀렸습니다.를 출력
	// 아이디와 비밀번호가 모두 맞은 경우 로그인 성공!을 출력
	Scanner sc = new Scanner(System.in);
	String id = "JTistory";
	String pw = "JT1487";
	
	// nextLine() : 한줄, next() : 한 단어
	System.out.print("아이디를 입력하세요. >> ");
	String ckid = sc.next();
	System.out.print("비밀번호를 입력하세요. >> ");
	String ckpw = sc.next();
	
	// 문자열.equals(문자열)은 두 문자열이 서로 '값'이 같은지를 비교하는 문법
	if (ckid.equals(id) == false) {
		System.out.println("아이디가 틀렸습니다.");
	} else if(ckpw.equals(pw) == false) {
		System.out.println("비밀번호가 틀렸습니다.");
	} else {
		System.out.println("로그인 성공!");
	}
	
	sc.close();

	}
}

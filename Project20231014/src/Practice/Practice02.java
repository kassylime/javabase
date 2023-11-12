// Day03 연습문제
package Practice;

import java.util.ArrayList;
import java.util.Scanner;

// 사람 5명 리스트에 저장하기
// 이름을 조사해 해당 이름이 리스트에 있는지 확인
// 추가가 완료된 뒤, 성씨를 입력해서 해당 성씨를 가지고 있는 사람을 전체 출력하는 프로그램 코드 작성

// 출력 예시
// 이름을 입력합니다 >> 김기동, 이원규, 김일현

// 성씨를 입력해 주세요 >> 이
// 검색결과 : 이원규


public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name_list = new ArrayList();

		// String name;
		String first_name;

		for(int i = 0; i < 3; i++) {
			System.out.print("이름을 입력해주세요 >> ");
			//name = sc.next();
			//name_list.add(name);
			name_list.add(sc.next());

		}
		
		// 성씨에 대한 입력을 진행
		System.out.print("성씨를 입력해주세요 >> ");
		first_name = sc.next();
		
		for(int i = 0; i < name_list.size(); i++) {
			// 입력한 값이 이름 목록에서 가져온 이름에서 한글자만 분리한 값과 동일하다면 
			// substring에 대한 기능은 Day02의 문자열 파트 참고
			// 문자열.substring(시작번호, 끝 번호)
			// 시작번호부터 끝 번호 전까지의 문장으로 분리해 주는 기능
			if(first_name.equals(name_list.get(i).substring(0, 1))) {
				System.out.println("검색 결과 : " + name_list.get(i));
			}
		}
		
// 		내 문제 풀이		
//		for(int i = 0; i < 5; i++) {
//		System.out.print("이름을 입력합니다 >> ");	
//		String name = sc.next();
//		name_list.add(name);
//		}
//		
//		System.out.println(name_list);
//		
//		System.out.print("성씨를 입력해주세요 >> ");
//		String first_name = sc.next();
//
//		
//		for(int i = 0; i < name_list.size(); i++) {
//			String result = name_list.get(i);  // 결과값 받을 변수 사용하기! ArrayList 가져올 때 get
//			if(result.contains(first_name)) {
//				System.out.println("검색결과 : " + result);
//			}
//		}  
		sc.close();
	}
}

package Day1224;
// 해시맵 만드는 방법
// HashMap<K, V> 해시맵 인스턴스 이름 = new HashMap();
// K, V는 각각 키와 값을 의미하는 타입 파라미터이며, 데이터 유형을 넣어주면 된다.
// HashMap<String, Integer> a = new HashMap();
// 키 : 문자, 값 : 숫자로 구성

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// 1. put(키, 값) : 해당 키를 해시맵에 추가
		// 2. get(키) : 키에 해당하는 값을 return
		// 3. containsKsy(키) : 해당 키가 맵에 존재하는지를 판단
		// 4. remove(키) : 해당키가 존재할 경우, 해당 키를 삭제, 키를 삭제하면 자동으로 값도 삭제
		// 5. size() : 해당 맵의 전체 데이터 개수(크기, 길이)를 return
		
		// 기존에 존재하는 키를 다시 put할 경우, 그 키에 넣어준 값이 다를 때 그 값으로 변경된다.
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		int data = 0;
		a.put("사과", 40);
		if(a.containsKey("사과")){
			if(a.get("사과") < 50) {
				
				data = a.get("사과");
				data -=10; 
				a.put("사과", data);
				System.out.println(a);
			}
		} else {
			System.out.println("사과는" + data + "개 밖에 없습니다.");
			a.put("사과", 20);
		}
		
		
	}

}

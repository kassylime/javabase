package Day04;

public class Example02 {

	public static void main(String[] args) {
		// while문 : 반복문
		// while(조건식){
		// 조건식이 만족하는 동안 실행할 명령문; }
		
		String word = "박수!";
		int count = 0;
		
		while(count != 10) {
			System.out.println(word + count);
			count++;
		}
	}

}

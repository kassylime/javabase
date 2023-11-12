package Day09;

public class Example01 {

	public static void main(String[] args) {
		// 브루트포스 brute force : 가능한 모든 경우의 수를 전부 탐색해서 요구조건에 충족되는 결과만 가져오는 방식
		// 장점 : 예외 상황 발생 없이 무조건 100% 확률료 정답만을 가져옴.
		
		int price = 120;
		int way = 0;
		int count =(int)Double.POSITIVE_INFINITY;
		
		for(int i = 0; i * 50 <= 120; i++) {
			for(int j = 0; j *10 <=120; j++) {
				if((i*50)+(j*10) == price) {
					
				}
			}
		}
	}

}

package Day09;

public class Example01 {

	public static void main(String[] args) {
		// 브루트 포스(brute force) : 직역하면 무식한 힘 정도 됩니다.
		// 가능한 모든 경우의 수를 전부 탐색해서 요구조건에 총족되는 결과만 가져오는 방식
		// 장점 : 예외 상황 발생 없이 무조건 100% 확률로 정답만을 가져옵니다.
	
		//대표적인 예시) 거스름돈
		//문제) 10원과 50원을 활용해 120원을 지불할 수 있는 모든 방법과 최소 동전의 개수를
		//구해봅시다. 	
		int price = 120;
		int way = 0; //방법의 개수
		int count = (int)Double.POSITIVE_INFINITY;
		//최소 동전의 개수(무한대)
		//무한대로 잡으려는 이유는 경우의 수이기 때문	
		//50원
		for(int i =0; i * 50 <= 120; i++)
		{
			//10원
			for(int j = 0; j *10 <= 120; j++)
			{
				if((i*50)+(j*10) == price)
				{
					way++;
					if(count > i+j)
						count = i+j;
				}
				
			}
		}
		System.out.printf("120원을 지불할 수 있는 모든 경우의 수 = %d입니다.\n", way);
		System.out.printf("지불할 최소 동전의 개수는 %d개 입니다.", count);	
	}

}

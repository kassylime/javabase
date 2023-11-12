package Day07;

import java.util.Arrays;
import java.util.Random;

public class Example01 {
	
	public static int[] shuffle(int[] array) {
		Random random = new Random(); // 랜덤 사용을 위한 클래스
		int value = 0; // 램덤을 통해 넣어줄 값
		
		for(int i = 0; i < array.length; i++) {
			value = random.nextInt(8); // 0-8까지 범위의 랜덤 값
			
			int temp = array[value];
			array[value] = array[value+1];
			array[value+1] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

}

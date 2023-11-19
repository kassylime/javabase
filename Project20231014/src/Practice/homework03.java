// Day10

package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	
		int array[] = new int[5];
		for(int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		Arrays.sort(array);
		
		System.out.println(sum/5);
		System.out.println(array[array.length/2]);
		sc.close();
	}

}

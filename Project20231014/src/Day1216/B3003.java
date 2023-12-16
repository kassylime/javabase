package Day1216;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[] pieces = {1, 1, 2, 2, 2, 8};
		
	
		for(int i = 0; i < pieces.length; i++) {
			pieces[i] -= sc.nextInt();
			System.out.print(pieces[i] + " ");
		}
		
		sc.close();
		
	}

}

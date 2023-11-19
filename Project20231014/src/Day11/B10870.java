package Day11;

import java.util.Scanner;

public class B10870 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(RecursiveMethod(N));
		sc.close();

	}
	
	
	public static int RecursiveMethod(int N) {
		if(N == 0) {
			return 0;
		}
		
		if(N == 1) {
			return 1;
		}

		return RecursiveMethod(N - 1) + RecursiveMethod(N - 2);
	}
	



}

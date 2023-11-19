package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < K; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value == 0) stack.pop();
			else stack.push(value);
		}
		
		int sum = 0;
		while(!stack.isEmpty())
			sum += stack.pop();
		System.out.println(sum);
	}

}

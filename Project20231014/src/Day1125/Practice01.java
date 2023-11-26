package Day1125;

import java.util.ArrayList;

class Buyer{
	private int money;
	private ArrayList<String> products;
	public int count = 0;
	
	public void by(Product p) {
		if(money < p.value) {
			System.err.println("잔액이 부족합니다.");
			return;
		}
		
		count++;
	}
	
	public void Info() {	
		
		int total = 0;
		
//		for(Product product : products) {
//			total += product.value;
//			System.out.println(product.name);
//			}
		System.out.println("사용금액 : " + total );
		System.out.println("남은금액 : " + money );
	}
	
	public void add() {
		Product p = new Product();
	}
}

class Product {
	public int value;
}
public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

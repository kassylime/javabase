package Day07;

import java.util.Scanner;

class Drink{
	String name;
	int price;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	// 생성자(Constructor)
	// 클래스와 이름이 동일한 메소드, 별도의 타입은 없으며, 클래스를 생성할 때 호촐되는 메소드
	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Drink(String name) {
		super();
		this.name = name;
	}

	public Drink() {
		// TODO Auto-generated constructor stub
	}
}


public class Example03 {

	public static void main(String[] args) {
		// 클래스와 생성자
		// 수정한 생성자의 형태대로 생성을 진행하면, 해당 객체는 그 정보를 가지고 생성된다.
		
		Drink Hongcha = new Drink("얼그레이", 3500);
		System.out.println(Hongcha.getName());
		System.out.println(Hongcha.getPrice());
		// 생성자 수정 이후는 이전처럼 아무것도 안 넣고 생성하는 것은 불가능 
		// 아무것도 넣지 않는 형태의 클래스 생성자를 별도로 만들어 줄 것
		Drink drink = new Drink();

		// Drink 클래스를 활용하여, 원하는 음료의 이름을 입력하면, 그 입력한 음료수 객체를 만들고, 화면에 출력하는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("음료수 이름을 입력하세요. >>");
		String name = sc.next();
		Drink drink1 = new Drink(name);
		System.out.println(drink1.getName());
		

	}

}

package Day1210;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BankApplication bankApp = new BankApplication();
		int selectNo;
		boolean isRun = true;
		while (true) {
			bankApp.MenuInfo();
			try {
				selectNo = bankApp.getSelect(sc.nextInt());
				isRun = bankApp.getMenu(selectNo);

			} catch (AccountException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("잘못된 선택입니다.");
				sc.nextLine();

			}
		}

	}

}

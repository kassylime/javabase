// Day09

package Practice;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDesString();
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s를 %s로 변경합니다.\n", getSrcString(), getDesString());
		System.out.printf("%s를 입력하세요 >> ", getSrcString());
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.printf("변환 결과 = %f %s입니다.\n", res, getDesString());
		sc.close();
	}
}

class Km2Mile extends Converter{

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDesString() {
		return "Mile";
	}

	
}


public class Practice09 {

	public static void main(String[] args) {
		// 해당 Converter 클래스를 활용해서 Km를 mile로 변환하는 Km2Mile 클래스를 작성하시오.
		// 1마일 = 1.6Km
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

}

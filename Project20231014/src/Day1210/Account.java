package Day1210;
// 계좌에 대한 클래스
public class Account {
	@Override
	public String toString() {
		return "계좌상세내역 [계좌번호=" + ano + ", 사용자 이름 =" + owner + ", 잔액 =" + balance + "]";
	}
	
	private String ano;    // 계좌번호
	private String owner;  // 사용자이름
	private int balance;   // 잔액
	
	
	// 필드 값을 초기화하는 생성자(private)
	private Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 생성자에 대한 정적 메소드 구현
	public static Account AccountMethod(String ano, String owner, int balance) {
		return new Account(ano, owner, balance);
	}
	
	// 메소드(getter/setter) : public
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

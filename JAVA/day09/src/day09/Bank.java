package day09;

public class Bank {	// 추상화 예시2 - 은행 입출금
	String owner;		// 예금주
	String account;		// 계좌번호
	// 접근지정자 private - setter, getter 메서드 필요
	private int money;	// 잔액
	// static(정적) 변수 (class 변수, 정적 필드): 정적 메모리 할당하는 변수
	// 객체생성 안해도 프로그램 시작시 한번만 할당 -> 참조하는 형태(데이터 공유)
	static double interestRate;// 이율
	
	public Bank() {
		interestRate = 0.07;
	}
	
	// setter: 매개변수o 반환타입x
	public void setMoney(int money) {
		this.money = money;
	}
	// getter: 매개변수x 반환타입o
	public int getMoney() {
		return this.money;
	}
	
	/** 입금 메서드 */
	public void deposit(int money) {
		this.money += money;
		System.out.println(money + "원 입금");
		System.out.println("잔액: " + money + "원");
	}
	/** 출금 메서드 */
	public void withdraw(int money) {
		if (this.money < money) {
			System.out.println(money + "원 출금");
			System.out.println("잔액부족 깝ㄴㄴ");
		} else {
			this.money -= money;
			System.out.println(money + "원 출금");
		}
		System.out.println("잔액: " + money+ "원");
	}
	public void getInfo() {
		System.out.println("-----");
		System.out.println(owner + "님의 계좌: " + account);
		System.out.println("잔액: " + (money += (money * interestRate)) + "원 "
						+ "(이자 " + (int) (interestRate * 100) + "% 포함)");
	}
}

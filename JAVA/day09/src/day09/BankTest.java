package day09;

public class BankTest {	// 추상화 활용 예시2 - 은행 입출금
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.owner = "오경덕";
		bank1.account = "1002-532-296636";
		
		bank1.deposit(50000000);
		bank1.getInfo();
		System.out.println("==================");
		
		Bank bank2 = new Bank();
		bank2.owner = "김민석";
		bank2.account = "123444-123";
		
		bank2.deposit(100000);
		bank2.withdraw(30000);
		bank2.withdraw(4500);
		bank2.getInfo();
		System.out.println("==================");
		
		Bank bank3 = new Bank();
		bank3.owner = "타노스";
		bank3.account = "112233-121233";
		
		bank3.deposit(1000);
		bank3.withdraw(50000);
		bank3.getInfo();
		System.out.println("==================");
		Bank.interestRate = 0.1;	// static(정적) 변수: 클래스로 직접 접근가능
		bank1.getInfo();
		bank2.getInfo();
	}
}

package day09;

public class BankTest {	// �߻�ȭ Ȱ�� ����2 - ���� �����
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.owner = "�����";
		bank1.account = "1002-532-296636";
		
		bank1.deposit(50000000);
		bank1.getInfo();
		System.out.println("==================");
		
		Bank bank2 = new Bank();
		bank2.owner = "��μ�";
		bank2.account = "123444-123";
		
		bank2.deposit(100000);
		bank2.withdraw(30000);
		bank2.withdraw(4500);
		bank2.getInfo();
		System.out.println("==================");
		
		Bank bank3 = new Bank();
		bank3.owner = "Ÿ�뽺";
		bank3.account = "112233-121233";
		
		bank3.deposit(1000);
		bank3.withdraw(50000);
		bank3.getInfo();
		System.out.println("==================");
		Bank.interestRate = 0.1;	// static(����) ����: Ŭ������ ���� ���ٰ���
		bank1.getInfo();
		bank2.getInfo();
	}
}

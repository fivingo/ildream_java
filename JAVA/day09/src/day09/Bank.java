package day09;

public class Bank {	// �߻�ȭ ����2 - ���� �����
	String owner;		// ������
	String account;		// ���¹�ȣ
	// ���������� private - setter, getter �޼��� �ʿ�
	private int money;	// �ܾ�
	// static(����) ���� (class ����, ���� �ʵ�): ���� �޸� �Ҵ��ϴ� ����
	// ��ü���� ���ص� ���α׷� ���۽� �ѹ��� �Ҵ� -> �����ϴ� ����(������ ����)
	static double interestRate;// ����
	
	public Bank() {
		interestRate = 0.07;
	}
	
	// setter: �Ű�����o ��ȯŸ��x
	public void setMoney(int money) {
		this.money = money;
	}
	// getter: �Ű�����x ��ȯŸ��o
	public int getMoney() {
		return this.money;
	}
	
	/** �Ա� �޼��� */
	public void deposit(int money) {
		this.money += money;
		System.out.println(money + "�� �Ա�");
		System.out.println("�ܾ�: " + money + "��");
	}
	/** ��� �޼��� */
	public void withdraw(int money) {
		if (this.money < money) {
			System.out.println(money + "�� ���");
			System.out.println("�ܾ׺��� ������");
		} else {
			this.money -= money;
			System.out.println(money + "�� ���");
		}
		System.out.println("�ܾ�: " + money+ "��");
	}
	public void getInfo() {
		System.out.println("-----");
		System.out.println(owner + "���� ����: " + account);
		System.out.println("�ܾ�: " + (money += (money * interestRate)) + "�� "
						+ "(���� " + (int) (interestRate * 100) + "% ����)");
	}
}

package sec02.exam06.quiz;

public class Account {
	private String user;
	private long balance;
	
	public Account() {
	}

	public Account(String user, long balance) {
		this.user = user;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		System.out.println(amount + "원이 입급되었습니다. [잔액: " + (amount +balance) + "원]");
		this.balance = balance+amount;

	}
	public void withdraw (int amount)  throws InsufficientBalanceException{
		if(amount > balance) {
			throw new InsufficientBalanceException("출금 실패: 잔액이 " + (amount-balance) + "원 부족합니다.");
		}else {
			System.out.println(amount + "원이 출금되었습니다. [잔액: " + (balance-amount) + "원]");
			this.balance = balance-amount;
		}
			
	}

	public String getUser() {
		return user;
	}

	public long getBalance() {
		return balance;
	}
	
}

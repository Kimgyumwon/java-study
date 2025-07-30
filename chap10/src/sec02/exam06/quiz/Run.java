package sec02.exam06.quiz;

public class Run {
	public static void main(String[] args) {
		Account user = new Account("김철수", 10000);
		try {
			user.withdraw(3000);
			user.deposit(5000);
			user.withdraw(14000);
		}catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("현재 잔액: " + user.getBalance() + "원");
	}
}

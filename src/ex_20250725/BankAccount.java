package ex_20250725;

public class BankAccount {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;	
		}
	}
	
	
}

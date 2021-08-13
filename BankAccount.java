public class BankAccount

{     
	private int balance;
	public BankAccount() {
		balance=5000;
	}
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount>balance)
			throw new InsufficientBalanceException("Insufficent Balance");
		else
			balance=balance-amount;
	}
	
}
class CustomException 
{
	public static void main(String args[]) 
	{ 
		Account acc = new Account(); 
		System.out.println("Current balance : " + acc.balance()); 
		System.out.println("Withdrawing 200"); acc.withdraw(200); 
		System.out.println("Current balance : " + acc.balance()); 
		acc.withdraw(1000); 
	} 
}

class Account 
{ 
	private int balance = 1000; 
	public int balance() 
	{ 
		return balance; 
	} 
	public void withdraw(int amount) throws InSufficientFundException 
	{ 
		if (amount > balance) 
		{ 
			throw new InSufficientFundException( String.format("Current balance %d is less than requested amount %d", balance, amount)); 
		} 
		balance = balance - amount; 
	} 
	public void deposit(int amount) 
	{ 
		if (amount <= 0) 
		{ 
			throw new IllegalArgumentException( String.format("Invalid deposit amount %s", amount)); 
		} 
	} 
}

class InSufficientFundException extends RuntimeException 
{ 
	private String message; 
	public InSufficientFundException(String message) 
	{ 
		this.message = message; 
	} 
	public InSufficientFundException(Throwable cause, String message) 
	{ 
		super(cause); 
		this.message = message; 
	} 
	public String getMessage() 
	{ 
		return message; 
	} 
}





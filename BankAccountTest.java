import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BankAccountTest {

	@Test(expected=InsufficientBalanceException.class)
	public void ValidateWithdrawnExceptionTest() throws InsufficientBalanceException
	{
		
		BankAccount customer = new BankAccount();
		customer.withdraw(10000);
	}
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void ValidateWithdrawExceptionMessageTest() throws InsufficientBalanceException
	{
		thrown.expect(InsufficientBalanceException.class);
		thrown.expectMessage("Insufficent Balance");
		BankAccount customer = new BankAccount();
		customer.withdraw(10000);
	}
}
package bankaccount;

import java.util.List;

public class BankUtil {

	public static double generateTransactionId() {
		return Math.round(Math.pow(10, 6) * Math.random());
	}
	
	public static void depositMoney(Account acc, double amount) {
		AccountsService service = AccountFactory.getAccountService(acc);
		service.deposit(acc, amount);		
	}
	
	public static double withdrawMoney(Account acc, double amount) {
		AccountsService service = AccountFactory.getAccountService(acc);
		return service.withdraw(acc, amount);
	}
	
	public static double checkBalance(Account acc) {
		AccountsService service = AccountFactory.getAccountService(acc);
		return service.checkBalance(acc);
	}
	
	public static List<AccountTransaction> showAllTransactions(Account acc){
		AccountsService service = AccountFactory.getAccountService(acc);
		return service.showAllTransactions(acc);
	}
}

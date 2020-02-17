package bankaccount;

import java.util.List;

public class ReimbursementAccountService implements AccountsService {

    @Override
    public void deposit(Account acc, double amount) {
        // TODO Auto-generated method stub
        acc.setBalance(acc.getBalance() + amount);
        System.out.println("Money deposited in " + acc.getHolderName() + " type: "+ acc.getAccountType()+ " amount = " + amount);
    }

    @Override
    public double withdraw(Account acc, double amount) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double checkBalance(Account acc) {
    	return acc.getBalance();
    }

    @Override
    public List<AccountTransaction> showAllTransactions(Account acc) {
    	return acc.getTransactions();
    }

	@Override
	public void recordTransaction(Account acc, AccountTransaction txn) {
		// TODO Auto-generated method stub
		
	}
    
}
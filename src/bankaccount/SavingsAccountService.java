package bankaccount;

import java.util.Date;
import java.util.List;

public class SavingsAccountService implements AccountsService {

	@Override
	public void deposit(Account acc, double amount) {
		synchronized (acc) {
			acc.setBalance(acc.getBalance() + amount);
			AccountTransaction txn = new AccountTransaction(BankUtil.generateTransactionId(), amount, new Date(), TransactionType.DEPOSIT, TransactionStatus.PROCESSED);
			txn.setBalanceAsOf(acc.getBalance());
			recordTransaction(acc, txn);
			System.out.println("Money deposited in " + acc.getHolderName() + " type: " + acc.getAccountType()
					+ " amount = " + amount);
		}
	}

	@Override
	public double withdraw(Account acc, double amount) {

		if (amount <= acc.getBalance()) {
			synchronized (acc) {
				acc.setBalance(acc.getBalance() - amount);
				AccountTransaction txn = new AccountTransaction(BankUtil.generateTransactionId(), amount, new Date(), TransactionType.DEPOSIT, TransactionStatus.PROCESSED);
				txn.setBalanceAsOf(acc.getBalance());
				recordTransaction(acc, txn);
				return amount;
			}
		} else {
			System.out.println("Oops! Not enough money in the account");
			AccountTransaction txn = new AccountTransaction(BankUtil.generateTransactionId(), amount, new Date(), TransactionType.DEPOSIT, TransactionStatus.PROCESSED);
			txn.setBalanceAsOf(acc.getBalance());
			recordTransaction(acc, txn);
			return 0;
		}

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
		synchronized (acc) {
			acc.getTransactions().add(txn);
		}
	}

}
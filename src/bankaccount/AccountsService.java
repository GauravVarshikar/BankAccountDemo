package bankaccount;

import java.util.List;

public interface AccountsService {
    void deposit(Account acc, double amount);

    double withdraw(Account acc, double amount);

    double checkBalance(Account acc);

    List<AccountTransaction> showAllTransactions(Account acc);

	void recordTransaction(Account acc, AccountTransaction transaction);
}
package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	private String holderName;
	private double balance;
	private List<AccountTransaction> transactions = new ArrayList<>();
	private AccountType accountType;

	public Account(String accountNumber, String holderName, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<AccountTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<AccountTransaction> transactions) {
		this.transactions = transactions;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
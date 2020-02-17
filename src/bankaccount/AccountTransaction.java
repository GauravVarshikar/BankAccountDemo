package bankaccount;

import java.util.Date;

public class AccountTransaction {

	private double transactionId;
	private double amount;
	private Date transactionDate;
	private TransactionType transactionType;
	private double balanceAsOf;
	private TransactionStatus status;

	public AccountTransaction(final double transactionId, final double amount, final Date transactionDate,
			final TransactionType type, final TransactionStatus status) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionType = type;
		this.status = status;
	}

	public double getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(final double transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(final double amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(final Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(final TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public double getBalanceAsOf() {
		return balanceAsOf;
	}

	public void setBalanceAsOf(final double balanceAsOf) {
		this.balanceAsOf = balanceAsOf;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankTransactions [transactionId=" + transactionId + ", amount=" + amount + ", transactionDate="
				+ transactionDate + ", transactionType=" + transactionType + ", balanceAsOf=" + balanceAsOf
				+ ", status=" + status + "]";
	}
}

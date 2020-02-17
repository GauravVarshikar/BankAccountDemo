package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankMain extends Thread {

	Account threadAcc;

	public BankMain(Account acc) {
		this.threadAcc = acc;
	}

	public static void main(final String[] s) {

		Account acc1 = new Account("122533688944", "Jack Dawson", AccountType.SAVINGS);
		acc1.setBalance(13000);
		Account acc2 = new Account("114455778899", "Susan Lang", AccountType.CURRENT);
		acc2.setBalance(23400);
		Account acc3 = new Account("000555111333", "Bo Lee", AccountType.SAVINGS);
		acc3.setBalance(20000);
		Account acc4 = new Account("777555000111", "Suresh Kumar", AccountType.SAVINGS);
		acc4.setBalance(50000);
		Account acc5 = new Account("005664889662", "Andy Fries", AccountType.SAVINGS);
		acc5.setBalance(60999);
		Account acc6 = new Account("335002115448", "Rich Lynn", AccountType.SAVINGS);
		acc6.setBalance(24000);

		List<Account> accounts = new ArrayList<>();
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);
		accounts.add(acc5);
		accounts.add(acc6);

		for (Account acc : accounts) {
			BankMain main1 = new BankMain(acc);

			main1.start();
		}

	}

	public void run() {
		try {
			BankUtil.depositMoney(this.threadAcc, 1000);
			Thread.sleep(1000);
			double withdrawnMoney = BankUtil.withdrawMoney(this.threadAcc, 500);
			System.out.println("Money Withdawn from " + this.threadAcc.getHolderName() + " :" + withdrawnMoney);
			Thread.sleep(1000);
			BankUtil.depositMoney(this.threadAcc, 8000);
			Thread.sleep(1000);
			System.out.println("Check balance of " + this.threadAcc.getHolderName() + ": "
					+ BankUtil.checkBalance(this.threadAcc));
			Thread.sleep(1000);
			System.out.println("Show Transactions of " + this.threadAcc.getHolderName() + ": "
					+ BankUtil.showAllTransactions(this.threadAcc));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
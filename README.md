# BankAccountDemo
Demo project for TW's training

Model a bank account that supports
- Deposit
- Withdrawal
- Balance-checking
- Listing-all transactions.
Maintain balance and transaction-list in memory.
After each operation add a validation that balance and list of transactions reconcile.
Ensure that all operations on this account is thread-safe.
You can use any language, any concurrency approach you know off.

Brief description of files in the "src/bankaccount/" directory:

BankMain.java:Class - This has the main method to execute the code.
AccountsService.java:Interface - Interface that has the actions to be performed by every bank account.
 SavingsAccount

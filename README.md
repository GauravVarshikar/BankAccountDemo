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

- BankMain.java:Class - This has the main method to execute the code.
- AccountsService.java:Interface - Interface that has the actions to be performed by every bank account.
 - SavingsAccountService.java: Class - Implementation concrete class which implements AccountsService interface. This has the actual implementation of all the actions for a Savings account.
 - CurrentsAccountService.java: Class - Implementation class for Currents account services
 - ReimbursementAccountService.java: Class - Implementation class for Reimbursement account services
- Account.java: Class - Account VO to hold account related data
- AccountTransaction.java: Class - VO to hold transactions data of an account
- AccountType.java: Enum - Enum for different account types
- TransactionType.java: Enum - Enum for different transaction types
- TransactionStatus.java: Enum - Enum for different transaction statuses
- AccountFactory.java: Class - Factory to generate Accounts Service implementation objects
- BankUtil.java: Class - Utility class containing methods for service executions.

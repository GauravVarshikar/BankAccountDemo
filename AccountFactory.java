package bankaccount;

public class AccountFactory {

    private AccountFactory(){}

    public static AccountsService getAccountService(Account acc){
        switch (acc.getAccountType()) {
            case SAVINGS:
                return new SavingsAccountService();
            case CURRENT:
                return new CurrentAccountService();
            case REIMBUSERMENT:
                return new ReimbursementAccountService();        
            default:
                return null;                
        }
    }

}

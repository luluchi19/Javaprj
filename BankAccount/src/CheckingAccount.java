class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.0;
    private static final int FREE_TRANSACTION = 3;
    private int transactionCount;

    public CheckingAccount(double balance) {
        super(balance);
        transactionCount = 0;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    @Override
    public boolean withdraw(double amount) {
        boolean success = super.withdraw(amount);
        if (success) {
            transactionCount++;
        }
        return success;
    }

    @Override
    public boolean transfer(BankAccount destination, double amount) {
        boolean success = super.transfer(destination, amount);
        if (success) {
            transactionCount++;
        }
        return success;
    }
    
    public void deductFees() {
        if (transactionCount > FREE_TRANSACTION) {
            setBalance(getBalance() - TRANSACTION_FEE * (transactionCount - FREE_TRANSACTION));
            transactionCount = 0;
        }
    }
    
}
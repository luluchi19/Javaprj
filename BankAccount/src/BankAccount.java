class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount destination, double amount) {
        if (withdraw(amount)) {
            destination.deposit(amount);
            return true;
        }
        return false;
    }

	@Override
	public String toString() {
		return "Balance= " + balance;
	}
}

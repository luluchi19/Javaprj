
public class main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(300);
		CheckingAccount ca = new CheckingAccount(500);
		SavingAccount sa = new SavingAccount(400, 6.5);
		System.out.println("ba "+ ba);
		System.out.println("ca "+ca);
		System.out.println("sa "+sa);
		ba.deposit(40);
		ca.withdraw(50);
		ca.transfer(sa, 100.00);
		sa.transfer(ba, 200.00);
		sa.calculateInterest();
		ca.deductFees();
		System.out.println("ba "+ ba);
		System.out.println("ca "+ca);
		System.out.println("sa "+sa);
		

	}

}

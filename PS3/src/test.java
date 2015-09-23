
public class test extends Account {
	public static void main(String args[]) {

		Account A = new Account(1122, 20000, 4.5);
		try {
			A.withdraw(2500);
			A.withdraw(40000);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, your account doesn't have enough money you are short " + e.getAmount());
			e.printStackTrace();
		}

		A.deposit(3000);

		System.out.println("Balance in account number " + A.getID() + " is: " + A.getbalance());
		System.out.println("Monthly interest is: " + (A.getMonthlyInterestRate() / 100 * A.getbalance()));
		System.out.println("Account is created on: " + A.getDateCreated());

	}
}

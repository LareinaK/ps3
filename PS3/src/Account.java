import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance, double annualInterestRate) {

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getbalance() {
		return this.balance;
	}

	public void setAnnualInterestrate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getAnnualInterestrate() {
		return this.annualInterestRate;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (this.annualInterestRate) / 12;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance < amount) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		} else {
			this.balance -= amount;
			System.out.println("New balance after withdrawing " + amount + " is " + this.balance);
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("New balance after depositing " + amount + " is " + this.balance);
	}
}

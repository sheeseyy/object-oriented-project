
public class Account {
	private String number;
	private String name;
	private double balance;
	
	public Account() {
	    this.number = "";
	    this.name = "";
	    this.balance = 0.0;
	}
	
	public Account(String num, String nm, double bal) {
		this.number = num;
		this.name = nm;
		this.balance = bal;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String num) {
		this.number = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public double getBalance() {
		return balance;
	}
	
	public void increaseBalance(double amt) {
		if (amt > 0) {
			balance = balance + amt;
		}
	}
	
	public void decreaseBalance(double amt) {
		if (amt > 0) {
			balance = balance - amt;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Account number %s, name %s, current balance is: %.2f", number, name, balance);
	}
}

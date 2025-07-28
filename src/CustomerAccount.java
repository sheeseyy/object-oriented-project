
public class CustomerAccount extends Account {
	
	public CustomerAccount() {
		super();
	}
	
	public CustomerAccount(String num, String nm, double bal) {
		super(num, nm, bal);
	}
	
	public Boolean checkBalance(double total) {
		if (getBalance() > total) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void buyItem(int qty, double price) {
		if (checkBalance(price * qty)) {
			decreaseBalance(price * qty);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void ReceivePayment(double amt) {
		increaseBalance(amt);
	}
	
	@Override
	public String toString() {
		return String.format("Customer: %s", super.toString());
	}
}

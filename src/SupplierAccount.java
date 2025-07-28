
public class SupplierAccount extends Account {
	private String SupplierType;
	
	public SupplierAccount() {
		super();
		this.SupplierType = "";
	}
	
	public SupplierAccount(String num, String nm, double bal, String st) {
		super(num, nm, bal);
		SupplierType = st;
	}

	public String getSupplierType() {
		return SupplierType;
	}

	public void setSupplierType(String st) {
		SupplierType = st;
	}
	
	public void increaseBalance(double amt) {
		if (SupplierType.equalsIgnoreCase("VIP")) {
			super.increaseBalance(amt*2);
		}
		else {
			super.increaseBalance(amt);
		}
	}
	
	public void sellItem(int qty, double price) {
		increaseBalance(price * qty);
	}
	
	@Override
	public String toString() {
		return String.format("Supplier: type %s %s", SupplierType, super.toString());
	}
}

package OOP;

public class BankOverride {
	private String name;
	
	public BankOverride() {
		super();
	}
	public String getName() {
		return name;
	}
	public BankOverride(String n) {
		this.name=n;
	}
	
	public double interestRate() {
		return 11.0;
	}

}

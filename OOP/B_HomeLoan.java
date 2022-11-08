package OOP;

public class B_HomeLoan {
	
	public static void main(String[]args) {
		BankOverride[] banks=new BankOverride[4];
		banks[0]=new BankOverride("RBI");
		banks[1]=new B_AxicBank();
		banks[2]=new B_HDFCBank();
		banks[3]=new B_ICICIBank();
		loanEnquiry(banks);
		
	}
	static void loanEnquiry(BankOverride[]banks) {
		for(BankOverride l:banks) {
			String name=l.getName();
			double rate=l.interestRate();
			System.out.println(name+"="+rate);
		}
	}

}

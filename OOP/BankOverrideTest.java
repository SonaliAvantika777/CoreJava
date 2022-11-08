package OOP;

public class BankOverrideTest {
	
	public static void main(String[]args) {
		BankOverride b=new BankOverride("RBI");
		B_AxicBank a=new B_AxicBank();
		B_HDFCBank h=new B_HDFCBank();
		B_ICICIBank c=new B_ICICIBank();
		
		System.out.println(b.getName()+"->");
		double d=b.interestRate();
		System.out.println("interestRate of RBI: "+d);
		
		System.out.println("\n"+a.getName()+"->");
		double d1=a.interestRate();
		System.out.println("interestRate of Axis Bank: "+d1);
		
		System.out.println("\n"+h.getName()+"->");
		double d2=h.interestRate();
		System.out.println("interestRate of HDFC Bank: "+d2);
		
		System.out.println("\n"+c.getName()+"->");
		double d3=c.interestRate();
		System.out.println("interestRate of ICICI Bank: "+d3);
		
	}

}

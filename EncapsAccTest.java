package OOP;

public class EncapsAccTest {
	public static void main (String[]args) {
		
		EncapsAcc x=new EncapsAcc();
		x.setNumber("10203088");
		x.setType("saving");
		x.setbalance(230000);
		//x.Deposit(5000);
		x.withdraw(7000);
		
		System.out.println(x.getNumber());
		System.out.println(x.getBalance());
		System.out.println(x.getType());
		
		
	}

}

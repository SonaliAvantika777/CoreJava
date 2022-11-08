package OOP;

 public class EncapsAcc {
	private String number;
	private String type;
	private double balance;
	
	//custom method=>
	//modifier returnType nameOfMethod(parameter list){
	// method body;
	//}
   public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Deposit(double balance) {
    	double amount= getBalance()+balance;
    	 setBalance(balance);
    }
   public void withdraw (double bal) {
	   double Amount= getBalance()-bal; 
	  setBalance(bal);
   }
public void setbalance(int i) {
	// TODO Auto-generated method stub
	}
}


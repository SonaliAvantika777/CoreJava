package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncapspersonTest {
	
	public static void main(String[]args) throws ParseException {
		EncapsPerson a=new EncapsPerson();
		
	SimpleDateFormat D= new SimpleDateFormat("dd/MM/yyyy");
	Date b=D.parse("01/02/2001");
		
		a.setName("Sonali");
		a.setAdd("indore(M.P.)");
		a.setDOB(b);
		
		String s=a.getName();
		System.out.println("Name: "+s);
		String s2=a.getAdd();
		System.out.println("Address: "+s2);
		System.out.println("DOB: "+a.getDOB());
		
	}

}

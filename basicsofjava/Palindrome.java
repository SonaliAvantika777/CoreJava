package in.co.basicsofjava;

public class Palindrome {

	  public static void main(String[]args) {
	
	  int num=303;
	  System.out.println("Num is:"+num);
	  
	  int temp=num;
	  int result=0;
	
	   while(num>0) {
		   int r =num%10;
		   result=result+(r*r*r);
		   num=num/10;
		
	   }
	    System.out.println();
	    if (temp==result) {
		     System.out.println("Num is Palindrome"+result);
	    }else {
		      System.out.println("false");
	     }
	}
}


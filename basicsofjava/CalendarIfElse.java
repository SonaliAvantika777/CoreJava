package in.co.basicsofjava;
public class CalendarIfElse {
    public static void main(String[]args) {
    	 
     int a= 30;
     int b=33;
    char c = '+' ; 
    	if(c=='+'){
    		 System.out.println("Addition ="+(a+b));
    	}
    	else if(c=='-'){
    		System.out.println("substrection ="+ (a-b));
    	}else if(c=='*'){
    		System.out.println("multiply ="+(a*b));
    	}else if(c=='/'){
    		System.out.println("Devison ="+(a/b));
    	}else{System.out.println("Enter currect opretor");}
    }
}

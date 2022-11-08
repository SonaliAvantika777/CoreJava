package in.co.basicsofjava;

public class EvenOdd {
	public static void main (String []args) {
		int n=10;
		int E=0;
		int O=0;
		int c=0;
		int c1=0;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0){
				E=E+i;
				c++;
			}
			else {
				O=O+i;
				c1++;
			}
	}
       System.out.println("Total"+E+"\neverage of Even Num: "+E+"/"+c+"="+E/c);
        System.out.println("Total"+O+"\neverage of Odd Num: "+O+"/"+c+"="+O/c1);
}
}
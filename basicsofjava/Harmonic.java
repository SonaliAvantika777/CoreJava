package in.co.basicsofjava;

  public class Harmonic {
    public static void main(String[] args) {
	       
     //Harminic value or num is the sum of reciprocals up to given value
     // ex- 1+1/2+1/3+1/4.....
    	
       System.out.print("1+");
    	
    	int k=0;
	     
    	   for(int i =1;i<5;i++) {
		     k=k+(1+(1/i));
		
		      System.out.print("1/"+i+"+");
	      }
	        System.out.println("\ntotel ="+k);

}
}

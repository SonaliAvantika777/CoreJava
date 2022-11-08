package in.co.basicsofjava;

public class Arry2ndLargNum {
	public static void main(String[]args) {
		
		int[]x= {72,4,66,10,2};
		int value=array(x);
		System.out.println(value);
		
	}
    public static int array(int[]a) {
    	int j=a[0];
    	for(int i=1;i<a.length;i++) {
    		if(j<a[i]) {
    			j=a[i];
    			
    		}j=a[i-1];
    	}
    return j;
    	
    }
}

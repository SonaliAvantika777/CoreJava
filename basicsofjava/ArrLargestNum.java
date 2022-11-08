package in.co.basicsofjava;

public class ArrLargestNum {
	
	public static void main(String[]args) {
		int[]t= {1,14,88,9,3,11};
		int value= Array(t);
		System.out.println(value);
		
	}
    public static int Array(int[]a) {
		int j=a[0];
		for(int i=1;i<a.length;i++) {
			if(j<a[i]) {
				j=a[i];
			}
		}
    	return j; 
    	
    }
}

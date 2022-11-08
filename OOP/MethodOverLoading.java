package OOP;

public class MethodOverLoading {
	
	public static void main(String[]args) {
		print(11,12);
		print("SonaliOO",7);
		print("Core","Java");
		
	}
	private static void print(int a,int b) {
		int c=a+b;
		System.out.println("Sum of "+a+"&"+b+"="+c);
	}
	private static void print(String name,int x) {
		System.out.println(name+""+x);
	}
	private static void print(String s1,String s2) {
		String s3=s1+s2;
		System.out.println(s3);
	}

}

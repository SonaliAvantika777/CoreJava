package OOP;

public class Encaps1test {
	public static void main(String[]args) {
		
		Encaps1 x=new Encaps1();
		x.setS("hello");
		x.setS1("java");
		x.setId(20);
		
		String S=x.getS();
		System.out.println(S);
		String S1=x.getS1();
		System.out.println(S1);
	

		int Id=x.getId();
		System.out.println(Id);
	}

}

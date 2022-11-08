package OOP_EX9_7;

public class ShapeOverridingTest {
	
	public static void main(String[]args) {
		
		Ques01ShapeOverriding s=new Ques01ShapeOverriding("Blue",5);
		SCircle c=new SCircle(12);
		SRectangle r=new SRectangle(10,8);
		STriangle t=new STriangle(5,9);
		
		System.out.println("Color of Shape: "+s.getColor());
		System.out.println("BorderWidth of Shape: "+s.getBorderwidth());
		
		System.out.println("\nRadius of a Circle: "+c.getRadius());
		double d=c.area();
		System.out.println("Area of Circle: "+d);
		
		System.out.println("\nLength of a Rectangle: "+r.getLength());
		System.out.println("width of a Rectangle: "+r.getWidth());
		double d1=r.area();
		System.out.println("Area of Rectangle: "+d1);
		
		System.out.println("\nBase of a Triangle: "+t.getBase());
		System.out.println("Height of a Triangle: "+t.getHeight());
		double d2=t.area();
		System.out.println("Area of Triangle: "+d2);
		System.out.println();
		
		Ques01ShapeOverriding []v=new Ques01ShapeOverriding[3];
		v[0]=new SCircle(22);
		v[1]=new SRectangle(10,5);
		v[2]=new STriangle(4,8);
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Area"+v[i].area());
		}
		
	}

}

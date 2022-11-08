package OOP;

 public class InheritShapeTest {
	
	public static void main(String[]args) {
		
		ITriangleEX T=new ITriangleEX(4, 5);
		ICircleEx C=new ICircleEx();
		IRectangleEx R=new IRectangleEx();
		
		double d = T.area();
		System.out.println("Base of Triangle: "+T.getBase());
		System.out.println("Height of Triangle: "+T.getHeight());
		System.out.println("Area of Triangle: "+d);
		
		C.setRadius(5);
		double d1=C.area();
		System.out.println("\nRadius of Circle: "+C.getRadius());
		System.out.println("Area of Circle: "+d1);
		
		R.setLength(14);
		R.setWidth(10);
		double d3=R.area();
		System.out.println("\nLenght of Rectangle: "+R.getLength());
		System.out.println("Widght of Rectangle: "+R.getWd());
		System.out.println("Area of Rectanle: "+d3);
		
		InheritShape S1=new InheritShape("Red",14,12);
		System.out.println("\nColor of Shape="+S1.getColor());
		System.out.println("side of Shape="+S1.getSide());
		System.out.println("Width of Shape="+S1.getWidth());
	}
}
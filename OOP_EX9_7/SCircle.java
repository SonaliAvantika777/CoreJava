
package OOP_EX9_7;

public class SCircle extends Ques01ShapeOverriding  {
	private double radius;
	
	public SCircle () {
		super();
	}
	public double getRadius() {
		return radius;
	}
	
	public SCircle (double r) {
		this .radius=r;
	}
	public double area() {
		return 3.14*radius*radius;
	}

}

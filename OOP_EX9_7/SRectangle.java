package OOP_EX9_7;

 public class SRectangle extends Ques01ShapeOverriding  {
	private int length;
	private int width;
	
	public SRectangle() {
		super();
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public SRectangle(int L,int W) {
		this.length=L;
		this.width=W;
	}
	public double area() {
		return length*width;
	}

}

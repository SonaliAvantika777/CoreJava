package OOP_EX9_7;

public class STriangle extends Ques01ShapeOverriding {
	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public STriangle(int B,int H) {
		this.base=B;
		this.height=H;
	}
	public STriangle() {
		super();
	}
	public double area() {
		return base*height;
	}

}

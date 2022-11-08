package OOP_EX9_7;

public class Ques01ShapeOverriding {
	private String color;
	private int borderwidth;
	
	public String getColor() {
		return color;
	}
	
	public int getBorderwidth() {
		return borderwidth;
	}

	public Ques01ShapeOverriding(String color, int borderwidth) {
		
		this.color = color;
		this.borderwidth = borderwidth;
	}
	public double area() {
		return 0;
	}
	public Ques01ShapeOverriding() {
		super();
	}
	

}

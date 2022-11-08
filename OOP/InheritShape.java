package OOP;

public class InheritShape {
	
	private String color;
	private int width;
	private int side;
	
	public String getColor() {
		return color;
	}
	public int getWidth() {
		return width;
	}
	public int getSide() {
		return side;
	}
	public InheritShape(String color, int width, int side) {
		super();
		this.color = color;
		this.width = width;
		this.side = side;
		}
	public InheritShape() {
		super();
	}
	//@Override
	//public String toString() {
		//return color+" "+width+" "+side;
	//}
}
package OOP;

public class ITriangleEX extends InheritShape{
		
	    private int base;
		private int height;
		
		public ITriangleEX(int base, int height) {
			   this .base=base;
			   this.height=height;
			}
		
		public int getBase() {
			return base;
		}
		public int getHeight() {
			return height;
		}
		
		public double area() {
			return 0.5*base*height;
	}
	}


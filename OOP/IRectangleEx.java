package OOP;

public class IRectangleEx extends InheritShape {
	
		private double length;
		private double wd;
		
	    public double getLength() {
			return length;
		}
        public void setLength(double length) {
			this.length = length;
		}
        public double getWd() {
			return wd;
		}
        public void setWidth(double widt) {
			this.wd = widt;
		}
        public double area() {
			return length *wd;
		}

	}




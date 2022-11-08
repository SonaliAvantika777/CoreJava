package OOP;

public class Automobileest {
	public static void main(String[]args) {
		
		Automobile A=new Automobile();
		A.setColor("White");
		A.setManufacturing("Tata Motors");
		A.setSpeed(90);
		A.setGear(4);
		
		Automobile c=new Automobile(); 
		int b=c.gear(3);
		System.out.println("Car in gear: "+b);
		
		System.out.println("Car's color: "+A.getColor());
		System.out.println("Car's Manufacturing: "+A.getManufacturing());
		System.out.println("Car's Speed: "+A.getSpeed());
		
		
	}

}

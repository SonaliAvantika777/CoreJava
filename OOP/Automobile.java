package OOP;

public class Automobile {
	private String color;
	private int speed;
	private int gear;
	private String manufacturing;
	
	public String getColor() {
		return color;
	}
    public void setColor(String color) {
		this.color = color;
	}
    public int getSpeed() {
		return speed;
	}
    public void setSpeed(int speed) {
		this.speed = speed;
	}
    public int getGear() {
		return gear;
	}
    public void setGear(int a) {
		this.gear = a;
	}
   
    public String getManufacturing() {
		return manufacturing;
	}
    public void setManufacturing(String manufacturing) {
		this.manufacturing = manufacturing;
	}
    public int gear(int a) {
		switch(a) {
		case 1:System.out.println("gear 1 speed=20km/hr");
		break;
		case 2:System.out.println("gear 2 speed=40km/hr");
		break;
		case 3:System.out.println("gear 3 speed=60km/hr");
		break;
		case 4:System.out.println("gear 4 speed=70km/hr");
		break;
		case 5:System.out.println("gear 5 speed=90km/hr");
		break;
		case 6:System.out.println("gear 6 speed=100km/hr");
		break;
			}return a;
	}
	
}

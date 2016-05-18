package question;

public class Bicycledemo {

	public static void main(String[] args) {
		
		bicycle B1 = new bicycle("purple","ladybirds", 10);
		bicycle B2 = new bicycle();
		
		
		B1.setDistancecovered(5);
		B1.setGear(3);
		B1.setSpeed(8);
		B1.displaystats();
		
		
		B2.setColor("Blue");
		B2.setBrand("Hercules");
		B2.setDistancecovered(15);
		B2.setGear(8);
		B2.setSpeed(12);
		B2.displaystats();
		
		B1.increaseSpeed(10);
		B1.displaystats();
		B1.increaseSpeed();
		B1.displaystats();
		B1.decreaseSpeed(5);
		B1.increaseGear(4);
		B1.decreaseGear(2);
		B1.displaystats();
		
	
		B2.increaseSpeed(5);
		B2.decreaseSpeed(2);
		B2.increaseGear(1);
		B2.decreaseGear(3);
		B2.displaystats();
		
	}

}

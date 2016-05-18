package question;

public class bicycle {
	private String color;
	private String brand;
	private int speed;
	private int distancecovered;
	private int gear;
	private int maxGear;
	
	
	
	bicycle(){

		}
	
	
	bicycle(String color, String brand){
		this.color = color;
		this.brand = brand;
		System.out.println("here");
	}
	
	bicycle(String color, String brand, int maxGear){
		
		this(color,brand);
		System.out.println("There");
		this.maxGear = maxGear;
		
	}
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDistancecovered() {
		return distancecovered;
	}
	public void setDistancecovered(int distancecovered) {
		this.distancecovered = distancecovered;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void increaseSpeed(double speed){
		this.speed += speed;
	}

	public void increaseSpeed(){
		this.speed = speed + 5;
	}
	
	public void decreaseSpeed(double speed){
		this.speed -= speed;
	}
	
	public void decreaseSpeed(){
		this.speed = speed - 5;
	}
		
	public void increaseGear(double gear){
		this.gear += gear;
	}
	
	public void increaseGear(){
		this.speed = gear + 1;
	}
		
	public void decreaseGear(double gear){
		this.gear += gear;
	}
	
	public void decreaseGear(){
		this.speed = gear - 1;
	}
	public void displaystats() {
		System.out.println(color +  " " + brand + " " + speed + " " + distancecovered + " " +gear + " ");
		
		}	
	
	
	

}

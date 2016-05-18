package question;

public class Cone {
	
	private int height;
	private int radius;
	private int slantheight;
	private double volume;
	private float surfaceArea;
	
	Cone(){
		height = 3;
		radius = 5;
		slantheight = 5*5 + 3*3;
	}
	
	Cone(int height, int radius){
		this.height = height;
		this.radius = radius;
		slantheight = height*height + radius*radius;
	}
	
	Cone(int height, int radius, int z){
		this.height = height;
		this.radius = radius;
		slantheight = z;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getSlantheight() {
		return slantheight;
	}
	public void setSlantheight(int slantheight) {
		this.slantheight = slantheight;
	}
	public double getVolume() {
		volume = 3.14*radius*height;
		return volume;
	
	}
	public float getSurfaceArea() {
		surfaceArea = radius*slantheight;
		return surfaceArea;
	}
	
	}
	
	
	
	

	



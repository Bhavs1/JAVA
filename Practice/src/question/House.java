package question;

public class House {
	
	private String color;
	private int number;
	private String type;
	private String address;
	private double cost;
	private int length;
	private int breadth;
	private int surfaceArea;
	private String ownerName;
	private boolean isSold;
	private boolean isUnderConstruction;
	private int floorLocation;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(int type) {
		this.type = Integer.toString(type) + "bhk";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getSurfaceArea() {
		surfaceArea = length * breadth;
		return surfaceArea;
	}
	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public String getOwnername() {
		return ownerName;
	}
	public void setOwnername(String ownername) {
		this.ownerName = ownername;
	}
	public boolean isSold() {
		return isSold;
	}
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}
	public boolean isUnderConstruction() {
		return isUnderConstruction;
	}
	public void setUnderConstruction(boolean isUnderConstruction) {
		this.isUnderConstruction = isUnderConstruction;
	}
	public int getFloorLocation() {
		return floorLocation;
	}
	public void setFloorLocation(int floorLocation) {
		this.floorLocation = floorLocation;
	}
	
	public void AddRepair(int x){
		cost += x;
		}
	
	public void increasePrice( int y){
		cost += y;
	}
	
	public void decreasePrice( int z){
		cost -= z;
	}
	
		
	
	public void display() {
		System.out.println("The color of house is: " + color);
		System.out.println("The number of house is: " + number);
		System.out.println("The type of house is: " + type);
		System.out.println("The address of house is: " + address);
		System.out.println("The cost of house is: " + cost);
		System.out.println("The length of house is: " + length);
		System.out.println("The breadth of house is: " + breadth);
		System.out.println("The surfaceArea of house is: " + getSurfaceArea());
		
	}
	
	
	

}

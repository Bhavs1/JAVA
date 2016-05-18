package question;

public class Cube {
	
	private int length;
	private int breadth;
	private int heigth;
	private float volume;
	
	Cube(){
		length = 10;
		breadth = 20;
		heigth = 30;
	}
	
	Cube(int x){
		length = breadth = heigth = x;
	}
	
	Cube(int x, int y){
		length = x;
		breadth = y;
		heigth = 100;
	}
	
	Cube(int x, int y, int z) {
		length = x;
		breadth = y;
		heigth = z;
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
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public float getVolume() {
		volume = length*breadth*heigth;
		return volume;
	}

	
	
	

}

package question;

public class Dogi {
	
	String breed;
	String color;
	int age;
	
	Dogi(){
		
	}
	
	Dogi(String breed, int age){
		this.breed = breed;
		this.age = age;
	}
	
	Dogi(String breed, String color, int age){
	this.breed = breed;
	this.color = color;
	this.age = age;
	}
	

	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void bark() {
		System.out.println("bow bow");
		
	}
	
	public void bark(int x) {
		for(int i =0;i < x; i++)
			System.out.println(" bow");
		
	}
	
	public void play() {
		System.out.println( breed + " is playing");
	}
	
	
	public void walk(boolean isRun) {
		if (isRun == true)
		System.out.println(breed + " is running" );
		else 
			System.out.println(breed + " is walking" );
	}
		
}

package question;

public class Dog {
	private String s1;
	
	
	public void bark(String s1){
		this.s1 = s1;
		
	}
	
	public void display() {
	
		System.out.println(" The dog " + s1  );
		
 }
	
	public static void main(String args[]){
		
		
		Dog d = new Dog();
		
		
		
		d.bark("howls");
		d.display();
		d.bark("winks");
		d.display();
		d.bark("laughs");
		d.display();
	
		
	}
	
	
	

}

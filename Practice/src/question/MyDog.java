package question;

public class MyDog {

	public static void main(String[] args) {
		
		Dogi D1 = new Dogi("Shanny","White", 5);
		Dogi D2 = new Dogi();
		
		
		
		D1.bark();
		D1.bark(10);
		D1.walk(false);
		D1.walk(true);
		
		D2.setAge(1);
		D2.setBreed("Johny");
		D2.setColor("Black");
		D2.bark();
		D2.bark(3);
		D2.walk(true);
		D2.walk(false);
		
		
		
		
		
		
		

	}

}

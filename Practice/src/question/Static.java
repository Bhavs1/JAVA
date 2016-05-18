package question;

public class Static {
	
	int id;
	int age;
	static String school;
	 
	public static void main(String[] args) {
	 Static s1 = new Static();
	 Static s2 = new Static();
	 
	 s1.id = 60;
	 s1.age = 15;
	 Static.school = "holy cross";
	 s2.id = 61;
	 s2.age = 16;
	 
	 s1.display();
	 s2.display();
	 

	}
	
	public void display(){
		school = "piyush";
		System.out.println( id + " " + age + " " + school);
	}

}


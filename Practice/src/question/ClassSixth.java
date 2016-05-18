package question;

public class ClassSixth {

	public static void main(String[] args) {
		Student Mark = new Student();
		Student Ken = new Student();
		Student Ruby = new Student();
		
		Mark.setAge(15);
		Ken.setAge(22);
		Ruby.setAge(20);
		
		System.out.println(Ruby.getAverage(Mark.getAge(),Ken.getAge(), Ruby.getAge()));

	}
	
	

}

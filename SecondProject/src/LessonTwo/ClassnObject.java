package LessonTwo;

public class ClassnObject {

	public static void main(String[] args) {
		/*int x = 2;
		x++;
		System.out.println(x);//Increases first hence 2 becomes 3
		System.out.println(x++);// Increase later hence 3 remains 3 n increase value is kept for next use
		System.out.println(x);// Increased value in the previous is used
		System.out.println(++x);//Increases first hence 2 becomes 3 */
	 
		Student mark = new Student();
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		System.out.println(mark.getName() + " is " + mark.getAge() + " years old");
		
	  
	
	}
	

}

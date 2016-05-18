package LessonTwo;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		System.out.println("Entered value is");
		System.out.print(user_input_number);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some decimalnumber");
		double user_input_double = scan1.nextDouble();
		System.out.println("Entered value is");
		System.out.print(user_input_double);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter some String");
		java.lang.String user_input_string = scan2.nextLine();
		System.out.println("Entered value is");
		System.out.print(user_input_string);
		
		
	    
	}
}

import java.util.Scanner;
public class User_Input {

	public static void main(String[] args) {
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a number");
		
		//Wait for the user to give input
		String line = input.nextLine();
		
		//Tell user what the entered
		System.out.println("You have entered " +line);
		
	}

}

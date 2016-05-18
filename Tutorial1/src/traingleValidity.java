import java.util.Scanner;

public class traingleValidity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstAngle, secondAngle, thirdAngle;
		System.out.println("Enter the first angle of the triangle");
		firstAngle = Integer.parseInt(input.nextLine());
		System.out.println("Enter the second angle of the triangle");
		secondAngle =Integer.parseInt(input.nextLine());
		System.out.println("Enter the third angle of the triangle");
		thirdAngle = Integer.parseInt(input.nextLine());
		 if (firstAngle+secondAngle+thirdAngle ==180)
		 {
			 System.out.println("The triangle is valid"); 
		 }
		 else
		 {
			 System.out.println("The triangle is invalid");
		 }
		

	}

}

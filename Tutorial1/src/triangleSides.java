import java.util.Scanner;

public class triangleSides {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstSide, secondSide, thirdSide;
		System.out.println("Enter the first side of the triangle");
		firstSide = Integer.parseInt(input.nextLine());
		System.out.println("Enter the second side of the triangle");
		secondSide =Integer.parseInt(input.nextLine());
		System.out.println("Enter the third side of the triangle");
		thirdSide = Integer.parseInt(input.nextLine());
		if(firstSide+secondSide>thirdSide&&secondSide+thirdSide>firstSide&&firstSide+thirdSide>secondSide)
		{
			System.out.println("Its a valid triangle");
		}
		else
		{
			System.out.println("Its a invalid triangle");
		}
	}

}

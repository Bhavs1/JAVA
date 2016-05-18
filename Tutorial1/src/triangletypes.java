import java.util.Scanner;

public class triangletypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstSide,secondSide,thirdSide;
		System.out.println("Enter first side");
		firstSide = Integer.parseInt(input.nextLine());
		System.out.println("nter second side");
		secondSide = Integer.parseInt(input.nextLine());
		System.out.println("Enter third side");
		thirdSide = Integer.parseInt(input.nextLine());
		if (firstSide==secondSide&&secondSide==thirdSide&&firstSide==thirdSide)
		{
			System.out.println("Triangle is equilateral");
		}
		else if (firstSide==secondSide || secondSide==thirdSide || firstSide==thirdSide)
		{
			System.out.println("Triangle is isoceles");
		}
		
		else if (firstSide!=secondSide && secondSide!=thirdSide && firstSide!=thirdSide && ((firstSide^2+secondSide^2)!=(thirdSide^2)))
		{
			System.out.println("Triangle is scalene");
		}
		else if((firstSide^2+secondSide^2)==(thirdSide^2))
		{
			System.out.println("Triangle is right-angled");
		}
	}

}

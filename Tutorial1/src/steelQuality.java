import java.util.Scanner;

public class steelQuality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float hardness,carbonContent,tensileStrength;
		System.out.println("Enter hardness of steel");
		hardness = Float.parseFloat(input.nextLine());
		System.out.println("Enter the carbon content of steel");
		carbonContent = Float.parseFloat(input.nextLine());
		System.out.println("Enter the tensile strength of steel");
		tensileStrength = Float.parseFloat(input.nextLine());
		if (hardness>=50&&carbonContent<=0.7&&tensileStrength>=5600)
		{
			System.out.println("Grade 10 steel");
		}
		else if (hardness>=50&&carbonContent<=0.7&&tensileStrength<5600)
		{
			System.out.println("Grade 9 steel");
		}
		else if (hardness<50&&carbonContent<=0.7&&tensileStrength>=5600)
		{
			System.out.println("Grade 8 steel");
		}
		else if (hardness>=50&&carbonContent>0.7&&tensileStrength>=5600)
		{
			System.out.println("Grade 7 steel");
		}
		else if (hardness>=50||carbonContent<=0.7||tensileStrength>=5600)
		{
			System.out.println("Grade 6 steel");
		}
		else
		{
			System.out.println("Grade 5 steel");
		}

	}

}

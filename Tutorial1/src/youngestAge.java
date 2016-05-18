import java.util.Scanner;

public class youngestAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ramAge,shyamAge,ajayAge;
		System.out.println("Enter Ram's age");
		ramAge = Integer.parseInt(input.nextLine());
		System.out.println("Enter Shyam's age");
		shyamAge = Integer.parseInt(input.nextLine());
		System.out.println("Enter Ajay's age");
		ajayAge = Integer.parseInt(input.nextLine());
		if (ramAge<shyamAge && ramAge <ajayAge || shyamAge==ajayAge && shyamAge>ramAge)
		{
		System.out.println("Ram is youngest");
		}
		else if (ramAge<shyamAge && ramAge >ajayAge || ramAge == shyamAge && ramAge>ajayAge)
		{
			System.out.println("Ajay is youngest");
		}
		else if (ramAge>shyamAge && shyamAge > ajayAge || ramAge==ajayAge && ramAge>shyamAge ||ramAge>shyamAge && shyamAge < ajayAge)
		{
			System.out.println("Shyam is youngest");
		}
		else if (ramAge == shyamAge && ramAge<ajayAge)
		{
			System.out.println("Ram and Shyam are youngest");
			}
		else if (ramAge==ajayAge && ramAge<shyamAge )
		{
			System.out.println("Ram and Ajay are youngest");
		}
		
		else if (shyamAge==ajayAge && shyamAge<ramAge)
		{
			System.out.println("Shyam and Ajay are youngest");
		}
		
		else if (shyamAge==ajayAge && shyamAge==ramAge)
		{
			System.out.println("All are of same age");
		}
	}

}

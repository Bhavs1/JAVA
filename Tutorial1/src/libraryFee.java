import java.util.Scanner;

public class libraryFee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float days;
		System.out.println("Enter no. of days");
		days = Integer.parseInt(input.nextLine());
		if (days>=1 && days<=5)
				{
			System.out.println("Fine is 50paise");
				}
		else if (days>=6 && days<=10)
		        {
	        System.out.println("Fine is 1 rupee");
		        }
		else if (days>10&& days<=30)
		        {
	        System.out.println("Fine is 5 rupee");
		        }
		else 
                {
             System.out.println("you memberships is cancelled");
                 }
	}

}

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter a number");
		x = Integer.parseInt(input.nextLine());
		while (x!=0)
		{
		if (x%2 == 0)
		{
		System.out.println("Number is an even");
		}
		else
		{
		System.out.println("Number is an odd");
		}
		
		}
		
		System.out.println("Enter a number");
        x = Integer.parseInt(input.nextLine());
		
        
		

	}

}

import java.util.Scanner;

public class absoluteValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter any number");
		num = Integer.parseInt(input.nextLine());
		
		if (num>0)
		{
			System.out.println("The absolute value is:" +num);
		}
		else
		{
			System.out.println("The absolute value is:"+(0-num));
		}

	}

}

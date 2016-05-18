package Lesson1;

import java.util.Scanner;

public class minimum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		String choice="Y";
		
		while (choice.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter a number");
			num = Integer.parseInt(input.nextLine());
			if (num<min)
			{
				min = num;
				}
			if (num>max)
			{
				max=num;
			}
			System.out.println("Enter Y or N");
			choice = input.nextLine();
		}
		System.out.println("minimum is: " +min);
		System.out.println("maximum is: " +max);
		System.out.println("range is: " +(max-min));


	}

}

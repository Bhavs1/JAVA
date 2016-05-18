package Lesson1;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,sumPositive=0,sumNegative=0,sumZero=0;
		String choice ="Y";
//		System.out.println("Enter choice Y or N");
//		choice = input.nextLine();
		while (choice.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter num");
			num = Integer.parseInt(input.nextLine());
			if (num>0)
			{
				sumPositive = sumPositive + 1;
			
			}
			if (num<0)
			{
				sumNegative = (sumNegative + 1);
		
			}
			if (num==0)
			{
				sumZero = (sumZero + 1);
			}
			System.out.println("Enter choice Y or N");
			choice = input.nextLine();
		}
		System.out.println("Sum of Positive:" +sumPositive);
		System.out.println("Sum of Negative:" +sumNegative);
		System.out.println("Sum of Zero:" +sumZero);
		
	
		}
}

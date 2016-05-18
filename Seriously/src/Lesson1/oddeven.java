package Lesson1;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = Integer.parseInt(input.nextLine());
		while (num!=0)
		{
			if (num%2==0)
			{
		System.out.println("Its an even number");
			}
	    else
	    {
			System.out.println("Its an odd number");
		    }
		System.out.println("Enter a number");
		num = Integer.parseInt(input.nextLine());
		}
		System.out.println("0 is neither odd nor even");
		
	}
}

package Lesson1;

import java.util.Scanner;

public class sumDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		/*int ones,tens,hundreds,num,sum;
		
		System.out.println("Enter a digit for ones place");
		ones = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter a digit for tens place");
		tens = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter a digit for hundreds place");
		hundreds = Integer.parseInt(input.nextLine());
		
		num = hundreds*100+tens*10+ones;
		
		System.out.println("Number entered by user is: " + num);
		
		sum = hundreds+tens+ones;
		System.out.println("the sum of digit is: " + sum);*/
		
		/* with two variables only for 3 digit*/
		int num,sum=0;
		/*System.out.println("Enter a three digit number");
		num = Integer.parseInt(input.nextLine());

		sum = (num/100)+((num%100)/10)+((num%100)%10);
		or
		sum = (num%10)+((num/10)%10)+((num/10)/10);
		System.out.println("The sum of digit is: " +sum);*/
		
		/*Using while loop*/
		System.out.println("Enter a number");
		num = Integer.parseInt(input.nextLine());
		while ( num != 0)
		{
			sum = sum + num%10;
			num = num/10;
			}
		System.out.println("The sum of digit is: " +sum);
	}
} 

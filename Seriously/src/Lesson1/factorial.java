package Lesson1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,i,fact =1;
		System.out.println("Enter a number");
		num = Integer.parseInt(input.nextLine());
		
		for(i=num;i>0;i--)
			{
			fact = i*fact;
			
			}
		System.out.println("The factorial of entered number is:" +fact);
		

	}

}

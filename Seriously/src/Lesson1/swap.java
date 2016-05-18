package Lesson1;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two number");
		num1 = Integer.parseInt(input.nextLine());
		num2 = Integer.parseInt(input.nextLine());
		/*num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
	    System.out.println("The value on num1 is:" +num1 );
	    System.out.println("The value on num2 is:" +num2 );
	         Using 3 variable     */
		int temp=0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The value on num1 is:" +num1 );
	    System.out.println("The value on num2 is:" +num2 );
		
		
		

	}

}

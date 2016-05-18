package Lesson1;

import java.util.Scanner;
/* use of while loop using continue and break*/

public class whileContinue {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char number;
		
		
		 while ( true)
		 {
			 System.out.println("enter any number");
			 number = input.nextLine().charAt(0);
			 
			 if (number>=48 && number<=57)
			 {
				continue;
			 }
			 else
			 {
				 break;
			 }
		 }
		 System.out.println("Thanks");
	}
}
package Lesson1;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any character");
		char ch;
	    ch = input.nextLine().charAt(0);
	 
		if(ch >=65 && ch <=90)
	    {
	    System.out.println("its a capital letter");
	    }
		else if (ch >=97 && ch <=122)
		{
		    System.out.println("its a small letter");
	    }
		else if (ch >=48 && ch <=57)
		{
		    System.out.println("its a number");
		    }
		else
		{
 		    System.out.println("its a speacial character");
		    }
		

	}

}

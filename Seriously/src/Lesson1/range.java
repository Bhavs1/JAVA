package Lesson1;

import java.util.Scanner;

public class range {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num,max= Integer.MIN_VALUE;
	String choice ="Y";
    while (choice.equalsIgnoreCase("Y"))
	{
		System.out.println("Enter num");
		num = Integer.parseInt(input.nextLine());
		if(num>max)
		{
			max=num;
	}
		System.out.println("Enter choice Y or N");
		choice = input.nextLine();
	}
     System.out.println(max);
	}
}

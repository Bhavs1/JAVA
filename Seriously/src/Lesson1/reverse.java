package Lesson1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {;
	
		Scanner input = new Scanner(System.in);
		int num,reverse=0;
		System.out.println("Enter a 5 digit number");
		num = Integer.parseInt(input.nextLine());
		while(num!=0)
		{
			reverse = reverse*10;
			reverse = reverse + num%10;
			num = num/10;
			
		}
		System.out.println("The reversed number is:" +reverse);
	}

}

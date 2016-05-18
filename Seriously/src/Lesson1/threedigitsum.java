package Lesson1;

import java.util.Scanner;

public class threedigitsum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, firstDigit,secondDigit,thirdDigit,sum;
		System.out.println("Enter a three digit number");
		num = Integer.parseInt(input.nextLine());
		
		firstDigit = num/100;
		secondDigit = (num%100)/10;
		thirdDigit = (num%100)%10;
		sum = firstDigit + secondDigit + thirdDigit;
		System.out.println("The sum of digit is: " +sum);
		
		
		
	}

}

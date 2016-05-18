package Lesson1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("enter an year");
		year = Integer.parseInt(input.nextLine());
		
		if (year%100==0||year%100!=0 && year%4==0){
			System.out.println("The year is a leap year");
		}
		else {
			System.out.println("The year is not a leap year");
		}
		
		
	}

}

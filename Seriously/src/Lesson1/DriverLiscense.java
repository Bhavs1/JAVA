package Lesson1;
/*A company insures its drivers in the following cases: − If the driver is married. − If the driver is
 *unmarried, male & above 30 years of age. − If the driver is unmarried, female & above 25 years of age
 *In all other cases the driver is not insured. If the marital status, sex and age of the driver are 
 *the inputs, write a program to determine whether the driver is to be insured or not.*/

import java.util.Scanner;

public class DriverLiscense {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String maritalStatus,sex;
		int age;
		System.out.println("Enter the marital status of the driver");
		maritalStatus = input.nextLine();
		System.out.println("Enter the sex of the driver");
		sex = input.nextLine();
		System.out.println("Enter the age of the driver");
		age = Integer.parseInt(input.nextLine());
		if( (maritalStatus.equalsIgnoreCase("married")) ||
			((maritalStatus.equalsIgnoreCase("unmarried") && 
					sex.equalsIgnoreCase("male") && 
					age>30))||
			((maritalStatus.equalsIgnoreCase("unmarried") && 
					sex.equalsIgnoreCase("female") && 
					age>25)))
		{
			System.out.println("Liscence can be insured");
		}
		else                                                                             
		{
			System.out.println("Liscence cannot be insured");
		}
		}
	}



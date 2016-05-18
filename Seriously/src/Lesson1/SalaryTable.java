package Lesson1;

import java.util.Scanner;

public class SalaryTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String qualification,gender;
		int yearofService;
		System.out.println("Enter the qualification of the employee");
		qualification = input.nextLine();
		System.out.println("Enter the gender of the employee");
		gender = input.nextLine();
		System.out.println("Enter the yearofService of the employee");
		yearofService = Integer.parseInt(input.nextLine());
		if( (gender.equalsIgnoreCase("male")) && (qualification.equalsIgnoreCase("post-graduate")) &&
				(yearofService>=10))
				{
			System.out.println("Salary : 15000");
				}
		
		else if( (gender.equalsIgnoreCase("female")) && (qualification.equalsIgnoreCase("post-graduate"))
				&&(yearofService>=10))
				{
			System.out.println("Salary : 12000");
				}
				
		else if( (gender.equalsIgnoreCase("male")) && (qualification.equalsIgnoreCase("graduate")) &&
				(yearofService>=10)||(gender.equalsIgnoreCase("male")) && 
				(qualification.equalsIgnoreCase("post-graduate")) &&
				(yearofService<10)||(gender.equalsIgnoreCase("female")) && 
				(qualification.equalsIgnoreCase("postgraduate")) &&
				(yearofService<10) )
		{
			System.out.println("Salary : 10000");
		}
		else if( (gender.equalsIgnoreCase("female")) && (qualification.equalsIgnoreCase("graduate"))&&
				(yearofService>10))
				{
			System.out.println("Salary : 9000");
				}   
		else if( (gender.equalsIgnoreCase("male")) && (qualification.equalsIgnoreCase("graduate")) &&
				(yearofService<10))
				{
			System.out.println("Salary : 7000");
				}
		else if( (gender.equalsIgnoreCase("female")) && (qualification.equalsIgnoreCase("graduate")) &&
				(yearofService<10))
				{
			System.out.println("Salary : 6000");
	}

	}

}

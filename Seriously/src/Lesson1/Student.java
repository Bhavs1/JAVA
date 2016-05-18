package Lesson1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float maths;
		System.out.println("Enter marks scored in maths");
		maths = Float.parseFloat(input.nextLine());
		while (maths < 0 || maths > 100)
		{
			System.out.println("Error: enter number between 0 to 100");
			maths = Float.parseFloat(input.nextLine());
		}
		float english;
		System.out.println("Enter marks scored in english");
		english = Float.parseFloat(input.nextLine());
		while (english < 0 || english > 100)
		{
			System.out.println("Error: enter number between 0 to 100");
			english = Float.parseFloat(input.nextLine());
		}
		float hindi;
		System.out.println("Enter marks scored in hindi");
		hindi = Float.parseFloat(input.nextLine());
		while (hindi < 0 || hindi > 100)
		{
			System.out.println("Error: enter number between 0 to 100");
			hindi = Float.parseFloat(input.nextLine());
		}
		float science;
		System.out.println("Enter marks scored in science");
		science = Float.parseFloat(input.nextLine());
		while (science < 0 || science > 100)
		{
			System.out.println("Error: enter number between 0 to 100");
			science = Float.parseFloat(input.nextLine());
		}
		float sst;
		System.out.println("Enter marks scored in sst");
		sst = Float.parseFloat(input.nextLine());
		while (sst < 0 || sst > 100)
		{
			System.out.println("Error: enter number between 0 to 100");
			sst = Float.parseFloat(input.nextLine());
		}
		float total, percentage;
		total = maths + english +hindi +science +sst;
		percentage = total/5;
		System.out.println(total);
		System.out.println(percentage);
		
		if (percentage > 80)
		{
			System.out.println("Very good");
		}
			else if (percentage < 30)
			{
				System.out.println("Its bad");
			}
			else 
				System.out.println("Its okay");
		}

	}
		




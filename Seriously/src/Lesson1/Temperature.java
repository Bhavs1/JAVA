package Lesson1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userChoice;
		float inputTemp, outputTemp;
		System.out.println("Enter 1 or 2");
		userChoice = Integer.parseInt(input.nextLine());
		if(userChoice == 1) {
			System.out.println("Enter temp in F");
		} else {
			System.out.println("Enter temp in C");
		}
		
		
		inputTemp = Float.parseFloat(input.nextLine());
		
		if(userChoice == 1){
			outputTemp = (5*(inputTemp-32))/9;
		} else {
			outputTemp = (9*(inputTemp+32))/5;
		}
		
		System.out.println("The converted temp is: " + outputTemp);
		
//		if (userChoice == 1)
//		{
//			
//			System.out.println("Enter temperature in fahreinheit");
//			fahreinheit = Float.parseFloat(input.nextLine());
//			celsius = 5/9*(fahreinheit-32);
//			System.out.println("the temp in celsius is: " +celsius);
//		}
//		else 
//		{
//			System.out.println("Enter temperature in celsius");
//			celsius = Float.parseFloat(input.nextLine());
//			fahreinheit = 9/5*(celsius+32);
//			System.out.println("the temp in fahreinheit is: " +fahreinheit);
//		}
		
	}

}

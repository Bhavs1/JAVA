package LessonTwo;

import java.util.Scanner;

/*Basic salary put through keyboard,DA is 40%,HRA is 20%, Find Gross Salary*/
public class Salary {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float sal,grosSal;
		System.out.println("Enter the salary");
		sal = Float.parseFloat(input.nextLine());
		grosSal = (float) (sal +(0.2*sal) + (0.4*sal));
		System.out.println("Gross salary is: " +grosSal);
		}
	}

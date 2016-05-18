package Lesson1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	    float sal;
	    System.out.println( "Enter Salary");
	    sal = Float.parseFloat(input.nextLine());
	    		
	    		
	    	//	Integer.parseInt(input.nextLine());
		
		float grosSal;
		grosSal = (float) (.4 * sal) +  (float) (.2 * sal) + sal;
	
		System.out.println("The salary is: " + grosSal);
		
		
	}

}

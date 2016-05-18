package Lesson1;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double kilometer;
	    System.out.println("Enter distance in kilometer");
	    kilometer = Double.parseDouble(input.nextLine());
	    double metre, centimetre, inch , feet;
	    metre = kilometer*1000;
	    centimetre = metre*100;
	    inch = centimetre/2.54;
	    feet = inch/12;
	    System.out.println("distance in meter is:" + metre);
	    System.out.println("distance in centimeter is:" + centimetre);
	    System.out.println("distance in inches is:" + inch);
	    System.out.println("distance in feet is:" + feet);
	 
	}

}

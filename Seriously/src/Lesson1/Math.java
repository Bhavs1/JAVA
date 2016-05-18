package Lesson1;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float length, breadth, radius, areaRectangle,perimeter, areaCircle, Circumference;
		System.out.println("Enter the length of the rectangle");
		length = Float.parseFloat(input.nextLine());
		System.out.println("Enter the breadth of the rectangle");
		breadth = Float.parseFloat(input.nextLine());
		System.out.println("Enter the radius of the circle");
		radius = Float.parseFloat(input.nextLine());
		
	    areaRectangle = length*breadth;
	    System.out.println("Area of the rectangle is:" + areaRectangle);
	    perimeter = length + breadth;
	    System.out.println("Perimeter of the rectangle is:" + perimeter);
	    areaCircle = (float) (3.14*radius*radius);
	    System.out.println("Area of the circle  is:" + areaCircle);
	    Circumference =(float) ((float)2*3.14*radius);
	    System.out.println("circumference of the circle is:" + Circumference);
	    }

}

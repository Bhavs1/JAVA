/*The marks obtained by a student in 5 different subjects are input through the keyboard. 
 *The student gets a division as per the following rules: Percentage above or equal to 60 -
 *First division Percentage between 50 and 59 - Second division Percentage between 40 and 49 - 
 *Third division Percentage less than 40 - Fail Write a program to calculate the division obtained by
 *the student.*/
package Lesson1;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int subject1, subject2, subject3, subject4, subject5,percentage;
	System.out.println("Enter marks in first subject");
	subject1=Integer.parseInt(input.nextLine());
	System.out.println("Enter marks in second subject");
	subject2=Integer.parseInt(input.nextLine());
	System.out.println("Enter marks in third subject");
	subject3=Integer.parseInt(input.nextLine());
	System.out.println("Enter marks in fourth subject");
	subject4=Integer.parseInt(input.nextLine());
	System.out.println("Enter marks in fivth subject");
	subject5=Integer.parseInt(input.nextLine());
	percentage = (subject1 +subject2+subject3+subject4+subject5)/5;
	 if (percentage >=60)
	 {
		 System.out.println("Student has got first division");
	 }
	 else if (percentage >=50)
	 {
		 System.out.println("Student has got second division");
	 }
	 else if (percentage >=40)
	 {
		 System.out.println("Student has got third division");
	 }
	 else 
	 {
		 System.out.println("Student has failed");
	 }
}

}
package Lesson1;

import java.util.Scanner;

public class primeNumber{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		int num,i,flag=0;
		System.out.println("Enter any number");
		num = Integer.parseInt(input.nextLine());
		for (i=2;i<num/2;i++)
		 if (num%i!=0){
			flag=0;
			 System.out.println("this is prime number");

			 break;
		 }
		flag=1;
		 System.out.println("this is not prime number");
		
			
		
		
		
}
}

	

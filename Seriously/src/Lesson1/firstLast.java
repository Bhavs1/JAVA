package Lesson1;

import java.util.Scanner;

public class firstLast {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, last=0,sum=0;
		System.out.println("Enter any number");
		num = Integer.parseInt(input.nextLine());
		sum = num%10;
		while (num!=0){
			last = num;
			num = num/10;
			
			}
		sum = sum +last;
		System.out.println("The sum is:" +sum);
		}

}

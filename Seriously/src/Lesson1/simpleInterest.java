package Lesson1;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,i,principal,rate,time ;
		float SI;
		System.out.println("Enter number of users");
		n = Integer.parseInt(input.nextLine());
		for (i=1;i<=n;i++)
		{
			System.out.println("Enter principal, rate, time of the user"+i);
			principal = Integer.parseInt(input.nextLine());
			rate = Integer.parseInt(input.nextLine());
			time = Integer.parseInt(input.nextLine());
			SI = (principal*rate*time)/100;
			System.out.println("SI of user"+i+ " "+ SI);
		}
		
	}

}

package Lesson1;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float itemNumber,totalSp,spItem,cpItem,profit;
		System.out.println("Enter number of items");
		itemNumber = Integer.parseInt(input.nextLine());
		System.out.println("Enter the total selling price");
		totalSp = Float.parseFloat(input.nextLine());
		spItem = totalSp/itemNumber;
		System.out.println("Enter the cpItem");
		cpItem = Integer.parseInt(input.nextLine());
		if(spItem>cpItem)
		{ 
			profit = spItem - cpItem;
			System.out.println("The profit per item is:" +profit);
		}
		else
			System.out.println("Cost price should be lesser than selling price,please enter valid cost price ");
		

	}

}

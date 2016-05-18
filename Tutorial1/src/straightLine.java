import java.util.Scanner;

public class straightLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1,x2,x3,y1,y2,y3;
		System.out.println("Enter the x-cordinates of P");
		x1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the y-cordinates of P");
		y1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the x-cordinates of Q");
		x2 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the x-cordinates of Q");
		y2 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the x-cordinates of R");
		x3 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the x-cordinates of R");
		y3 = Integer.parseInt(input.nextLine());
		if ((y2-y1)*(x3-x2)==(y3-y2)*(x2-x1))
		{
			System.out.println("The points are on straight line");
		}
		else 
		{
			System.out.println("The points are not on straight line");
		}
		
	}

}

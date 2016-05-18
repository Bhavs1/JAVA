import java.util.Scanner;

public class cilclePoint {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			int x1,x2,y1,y2,radi;
			System.out.println("Enter the x-cordinates of the circle's centre");
			x1 = Integer.parseInt(input.nextLine());
			System.out.println("Enter the y-cordinates of the circle's centre");
			y1 = Integer.parseInt(input.nextLine());
			System.out.println("Enter the x-cordinates of pont P");
			x2 = Integer.parseInt(input.nextLine());
			System.out.println("Enter the y-cordinates of pont P");
			y2 = Integer.parseInt(input.nextLine());
			System.out.println("Enter the radius");
			radi = Integer.parseInt(input.nextLine());
			if ((int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2)==(int)Math.pow(radi,2))
			{
				System.out.println("Pont is on circle");
			}
			else if ((int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2)>(int)Math.pow(radi,2))
			{
				System.out.println("The point is outside circle");
			} 
			else if ((int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2)<(int)Math.pow(radi,2))
			{
				System.out.println("The point is inside circle");
			}
	}


}

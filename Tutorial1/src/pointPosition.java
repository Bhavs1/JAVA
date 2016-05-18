import java.util.Scanner;

public class pointPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1,y1;
		System.out.println("Enter the x-cordinates of point");
		x1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter the y-cordinates of point");
		y1 = Integer.parseInt(input.nextLine());
		if(x1==y1&&y1==0)
		{
			System.out.println("Point is on origin");
		}
		else if(y1==0)
		{
			System.out.println("Point is on x-axis");
		}
		else if(x1==0)
		{
			System.out.println("Point is on y-axis");
		}
		else if (x1!=0 && y1!=0)
		{
			System.out.println("Point is not on any axis");
		}
	}

}

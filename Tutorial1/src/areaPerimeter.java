import java.util.Scanner;

public class areaPerimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length, breadth;
		System.out.println("Enter the length of rectanle");
		length = Integer.parseInt(input.nextLine());
		System.out.println("Enter the breadth of rectanle");
		breadth =Integer.parseInt(input.nextLine());
		
		if (length*breadth> 2*(length+breadth))
		{
			System.out.println("Area is greator");
		}
		else
		{
			System.out.println("Perimeter is greator");
		}
	}
	

}

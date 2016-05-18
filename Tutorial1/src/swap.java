import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter two numbers");
		x = Integer.parseInt(input.nextLine());
		y = Integer.parseInt(input.nextLine());
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("the value of x is " + x);
		System.out.println("the value of y is " + y);
		
		

	}

}

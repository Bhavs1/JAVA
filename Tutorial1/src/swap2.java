import java.util.Scanner;
public class swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers");
		x = Integer.parseInt(input.nextLine());
		y = Integer.parseInt(input.nextLine());
		
		x = x+y;
		y = x-y;
		x= x-y;
		
		
		System.out.println("the value of x is " + x);
		System.out.println("the value of y is " + y);
		
		

	}

}

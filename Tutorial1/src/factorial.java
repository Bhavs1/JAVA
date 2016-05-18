import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO 
		Scanner input = new Scanner(System.in);
		int i,x,y=1;
		System.out.println("enter a number ");
		x = input.nextInt();
		
		for(i=x;i>0;i--){
			y= y*i;
			}
		System.out.println("the factorial is" +y );
		
	}

}

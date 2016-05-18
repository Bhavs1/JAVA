
import java.util.Scanner;



public class armstrongNumber {

	public static void main(String[] args) {
	
		int i,cube_First,cube_Second,cube_Third;
		
		for (i=1;i<=500;i++)
		{
			cube_Third = (int)Math.pow(i%10,3);
			cube_Second = (int)Math.pow((i/10)%10,3);
			cube_First = (int)Math.pow((i/10)/10,3);
			if (cube_First +cube_Second+cube_Third==i)
			{
				
				System.out.println(i + " is armstrong ");
			}
			
		}
	}
}



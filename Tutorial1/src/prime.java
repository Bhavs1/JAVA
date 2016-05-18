import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i,x;
		System.out.println("Enter a number");
		x = Integer.parseInt(input.nextLine());
		
		for (i=2;i<x;i++){
			if (x%i == 0){
				System.out.println("Not a prime number");
				i=x;
			}
			
		}
		    if(x%i!=0)
		    System.out.println("Prime number");
		        }
		}
		

	



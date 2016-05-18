import java.util.Scanner;

public class extraPay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int hours,workers,i;
		System.out.println("Enter number of workers");
		workers = Integer.parseInt(input.nextLine());
		
		
		
		for(i=1;i<=workers;i++){
			System.out.println("Enter working hours");
			hours = Integer.parseInt(input.nextLine());
			if (hours<=40)
			{
				System.out.println("No extra payment");
			}
			else if (hours>40)
			{
				System.out.println("Extra amount payed is:"+((hours-40)*12)*i);
			}
		}
	}
	

}

import java.util.Scanner;

public class workerEfficiency {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float hour;
		System.out.println("Hours required by user to complete the work");
		hour = Float.parseFloat(input.nextLine());
		if (hour>=2&&hour<3)
		{
			System.out.println("Worker is highly efficient");
		}
		else if(hour>=3&&hour<4)
		{
			System.out.println("Worker should improve speed");
		}
		else if(hour>=4&&hour<5)
		{
			System.out.println("Worker should be given training to improve");
		}
		else if(hour>=5)
		{
			System.out.println("Worker should be asked to leave");
		}

	}

}

import java.util.Scanner;

public class number {
	    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		/*int userChoice,number,i,sumPositive=0,sumNegative=0,sumZero=0;
		System.out.println("Enter no. of attempts");
	    userChoice = Integer.parseInt(input.nextLine());
		for (i=1;i<=userChoice;i++)*/
		
		int number=0,sumPositive=0,sumNegative=0,sumZero=0;
		char choice ;
		System.out.println("Enter Y or N");
		choice = input.nextLine().charAt(0);
		while(choice=='Y' || choice =='y')
		{
			{
		System.out.println("Enter any real number");
         number = Integer.parseInt(input.nextLine());
         System.out.println("Enter Y or N");
         choice = input.nextLine().charAt(0);
		}
         if (number>0)
        {
       	  sumPositive= sumPositive+1;
        }
        else if(number<0)
        {
         sumNegative= sumNegative+1;
      	 }
        else
        {
       	 sumZero= sumZero+1;
	      }
		}
		
         System.out.println("Number of postive:"+sumPositive);
         System.out.println("Number of negative:"+sumNegative);
         System.out.println("Number of Zero:"+sumZero);
       }
}


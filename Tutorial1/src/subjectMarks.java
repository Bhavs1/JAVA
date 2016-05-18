import java.util.Scanner;

public class subjectMarks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float marksA,marksB;
		System.out.println("Enter marks obtained in A");
		marksA = Integer.parseInt(input.nextLine());
		System.out.println("Enter marks obtained in B");
		marksB = Integer.parseInt(input.nextLine());
		if ((marksA>=55&&marksB>=45)||(marksA<55&&marksB>=55&&marksA>45))
				{
			System.out.println("Student will get degree");
				}
		else if(marksA>=65&&marksB<45)
		{
			System.out.println("Student can reappear");
		}
		else 
		{
			System.out.println("Student has failed");
		}

	}

}

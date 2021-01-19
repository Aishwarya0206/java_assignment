package grade_cal;
// Main file
import java.util.Scanner;

public class grade_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float maths, science, social, english, hindi;
		System.out.println("Enter English Mark : ");
		Scanner s = new Scanner(System.in);
		english = s.nextFloat();
		System.out.println("Enter Hindi Mark : ");
		Scanner s1 = new Scanner(System.in);
		hindi = s1.nextFloat();
		System.out.println("Enter Maths Mark : ");
		Scanner s2 = new Scanner(System.in);
		maths = s2.nextFloat();
		System.out.println("Enter Science Mark : ");
		Scanner s3 = new Scanner(System.in);
		science = s3.nextFloat();
		System.out.println("Enter Social Mark : ");
		Scanner s4 = new Scanner(System.in);
		social = s4.nextFloat();
		float total = science + social + maths + english + hindi;
		System.out.println("Total : "+ total);
		float avg = total/5;
		System.out.println("Average : "+avg);
		if(avg>=80)
		{
			System.out.println("Grade A");
		}
		else if(avg>=60)
		{
			System.out.println("Grade B");
		}
		else if(avg>=40)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade F");
		}
	}

}

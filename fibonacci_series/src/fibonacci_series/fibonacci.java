package fibonacci_series;
// Main file
import java.util.Scanner;

public class fibonacci {
	static int first = 0, second = 1, next = 0;
	static void fib_series(int num)
	{
		if(num>0) {
			next = first+ second;
			first = second;
			second = next;
			System.out.print(" "+next);
			fib_series(num-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		System.out.println("How many fibonacci values you need?");
		Scanner s = new Scanner(System.in);
		val = s.nextInt();
		System.out.print(first+" "+second);
		fib_series(val-2);
	}

}

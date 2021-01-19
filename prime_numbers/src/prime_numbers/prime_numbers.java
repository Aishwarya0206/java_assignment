package prime_numbers;

import java.util.Scanner;

public class prime_numbers {
	static void is_prime(int num)
	{
		boolean isPrime = true;
		for( int i=2; i<num; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a Prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num = s.nextInt();
		is_prime(num);
	}

}

/*Name: Trevor Lilly
Date: 9/02/2022
Program Name: fib.java
Program Description: A program that returns the nth term from the fibonacci sequence.*/

import java.util.Scanner;
public class fib {

	public static void main(String[] args) {
		// scanner input that takes in the integer
		Scanner fInput = new Scanner(System.in);
		System.out.println("What term would you like to get from the fibonacci sequence?");
		// integer is then passed into the fib method, which is just a recursive fibonacci method.
		int fibInput = fInput.nextInt();
		System.out.println("The " + fibInput + "th term of the fibonacci sequence is " +  fib(fibInput));
	}

	// a recursive fibonnaci method that takes the fibInput from main.
	public static int fib(int fibInput) {
		if (fibInput <= 1 )
			return fibInput;
		else 
			return (fib(fibInput - 1) + fib(fibInput - 2));
	}

}

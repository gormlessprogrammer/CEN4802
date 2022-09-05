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

	/**
	 * Returns the nth term in the fibonacci sequence. The fibInput is an integer
	 * taken from the main method which can be defined by the user. If the number is
	 * less than one, the base case will simply return the fibInput. Above that,
	 * recursion using the fib method is used.
	 * 
	 * @author	Trevor L
	 * @param	fibInput an integer that represents the nth term of the fibonacci sequence.
	 * @return	returns either the base case (itself) or the nth term of the fibonacci sequence.
	 */
	public static int fib(int fibInput) {
		if (fibInput <= 1 )
			return fibInput;
		else 
			return (fib(fibInput - 1) + fib(fibInput - 2));
	}

}

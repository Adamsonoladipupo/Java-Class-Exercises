import java.util.Scanner;

public class ExponentialSequence{
	public static void main(String[] args){

		System.out.println("Welcome! This app helps you find the ExponentialSequence of numbers");

		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = inputCollector.nextInt();

		int count = 0;
		int factorial = 1;
		double exponentialS = 1;
		for (count = 1; count < userInput; count++){
			factorial = count * factorial;
			exponentialS = exponentialS + 1/factorial;
			System.out.println(exponentialS);
		}
	}
}
import java.util.Scanner;

public class factorialE{
	public static void main(String[] args){

		System.out.println("Welcome! This app helps you find the ExponentialSequence of numbers");

		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double userInput = inputCollector.nextDouble();

		double count = 0;
		double factorial = 1;
		double exponentialS = 1;
		for (count = 1; count <= userInput; count++){
			factorial = count * factorial;
			exponentialS = exponentialS + (1/factorial);
			
		}
		System.out.printf("the value is: %.4f", exponentialS);
	}
}
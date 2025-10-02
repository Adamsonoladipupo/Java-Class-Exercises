import java.util.Scanner;

public class AverageOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		double userInput = 1;
		double mean = 0;
		double sumOfInput = 0;
		do {	
			count++;
			System.out.printf("Enter number %d ( -1 to stop ): ", count);
			userInput = input.nextDouble();
			sumOfInput += userInput;

		} while (userInput != -1);
		count--;
		sumOfInput++;

		mean = sumOfInput/count;
		System.out.printf("The mean of the numbers is: %.2f", mean);
	}
	/* public static double MeanOfNumbers(double input){
		return userInput;
	} */

}
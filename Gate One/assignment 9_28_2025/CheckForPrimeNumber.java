import java.util.Scanner;

public class CheckForPrimeNumber{
	public static void main(String[] args){
		System.out.println("Welcome! This app helps you check if a number is a Prime number");
		
		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = inputCollector.nextInt();

		int counter = 0;
		for (counter = 2; counter < number; counter++){
			if (number % counter != 0){
				System.out.printf("%d is a prime number %n", number);
				break;
			} 
			if (number % counter == 0){
				System.out.printf("%d is not a prime number %n", number);
				break;
			}
		}
	}
}
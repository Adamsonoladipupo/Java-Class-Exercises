import java.util.Scanner;

public class SpecifiedSum{
	public static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);
		
		System.out.print("Enter your specified number: ");
		int specifiedNumber = inputCollector.nextInt();

		int randomNumber = 0;
		int sumOfRandomNumbers = 0;
		while (sumOfRandomNumbers < specifiedNumber){
			System.out.print("Enter random numbers: ");
			randomNumber = inputCollector.nextInt();
			
			sumOfRandomNumbers += randomNumber;
			
		}
		System.out.printf("The sum of your random number is equals to or greater than %d",specifiedNumber );

	}
}
import java.util.Scanner;

public class PositiveNegativeAndZeroNumbers{
public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		
		int userInput = 0;
		int numberOfPositive = 0;
		int numberOfNegative = 0;
		int numberOfZero = 0;
		
		while (userInput != -404){
			
			System.out.print("Enter a number: ");
			userInput = inputCollector.nextInt();
			
			if ( userInput == 0){
				numberOfZero +=1;
			} else if ( userInput > 0){
				numberOfPositive +=1;
			} else if ( userInput < 0){
				numberOfNegative +=1;
			}
			
		}
		System.out.printf("There are:%n Zero(s) %d %n Positive %d %n Negative %d", numberOfZero,numberOfPositive,numberOfNegative );
	}
}

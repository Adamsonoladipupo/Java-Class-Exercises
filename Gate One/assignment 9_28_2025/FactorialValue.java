import java.util.Scanner;

public class FactorialValue{
	public static void main(String[] args){
		System.out.println("Welcome! This app helps you find the factorial of a number");
		
		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = inputCollector.nextInt();
		
		int counter = 0;
		long factorial = 1;
		for(counter = 1; counter <=number; counter++){
			factorial = factorial * counter;
		}
		System.out.printf("The factorial of %d is: %d", number, factorial);
		

}
}
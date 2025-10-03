import java.util.Scanner;

public class KataTest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		
		//int result = Kata.numberOfFactorsIn(number);
		boolean result = Kata.isPrime(number);
		
		// System.out.printf("There are %d factors", result);
		System.out.print(result);
	}
}
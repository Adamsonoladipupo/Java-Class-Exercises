import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int user_input = inputCollector.nextInt();

		int factorial = 1;
		int count = 0;
		for(count = 1; count<= user_input; count++){
			factorial = count * factorial;
			System.out.println(factorial);
		}
	}
}
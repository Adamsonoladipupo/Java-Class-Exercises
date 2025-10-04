import java.util.Scanner;

public class KataTest{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int number1 = input.nextInt();
		System.out.print("Enter a number 1: ");
		int number2 = input.nextInt();
		
		
		int result = Kata.subtract(number1, number2);

		
		System.out.print(result);

	}
}
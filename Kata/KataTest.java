import java.util.Scanner;

public class KataTest{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int number = input.nextInt();
		
		
		
		boolean result = Kata.isSquare(number);

		
		System.out.print(result);

	}
}
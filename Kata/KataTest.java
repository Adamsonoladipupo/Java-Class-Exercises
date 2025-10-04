import java.util.Scanner;

public class KataTest{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		long number = input.nextLong();

		
		
		long result = Kata.squareOf(number);

		
		System.out.print(result);



		//System.out.print(quotient);
	}
}
import java.util.Scanner;

public class KataTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();



		
		
		boolean result = Kata.isEven(number);

		
		System.out.print(result);



		//System.out.print(isEven);
	}
}
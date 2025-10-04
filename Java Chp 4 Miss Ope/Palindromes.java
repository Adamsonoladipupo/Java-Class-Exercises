import java.util.Scanner;

public class Palindromes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a five digits Palindrome number: ");
		int userInput = input.nextInt();

		while (userInput < 9999 || userInput >99999 ){
			System.out.println("Invalid input, input only five digit numbers");
			System.out.print("Enter a five digit number: ");
			userInput = input.nextInt();	
		}
		int initialUserInput = userInput;
		int palindrome = 0;
		int palindromes = 0;
		int newPalindromes = 0;
		for(int count = 5; count >= 1; count--){
			palindrome = userInput % 10;
			userInput = userInput / 10;
			palindromes = (int)Math.pow(10, count-1) * palindrome;
			newPalindromes = newPalindromes + palindromes;
		}

		// System.out.printf("%d %n", newPalindromes);
		boolean check;
		if (initialUserInput == newPalindromes){
			check = true;
		}else {check = false;}
		System.out.print(check);
	}
}

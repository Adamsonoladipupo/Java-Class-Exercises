import java.util.Scanner;

public class TenValidScores{
	public static void main(String[] args){
		int scores[] = new int[10];
		int sumOfValidNumber = 0;
		Scanner input = new Scanner(System.in);
		for (int count = 0; count < 10; count++){
			System.out.print("Enter number: ");
			scores[count] = input.nextInt();
			if(scores[count] < 0 || scores[count] > 100){
				System.out.println("Invalid input (0 - 100)");
			}
			sumOfValidNumber = sumOfValidNumber + scores[count];
		}
		System.out.printf("Sum of valid numbers: %d", sumOfValidNumber);
	}
}
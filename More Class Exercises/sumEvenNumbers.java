import java.util.Scanner;

public class sumEvenNumbers{
	public static void main(String[] args){
		int scores[] = new int[10];
		Scanner input = new Scanner(System.in);
		int sumEvenNumbers = 0;
		for (int count = 0; count < 10; count++){
			System.out.print("Enter number: ");
			scores[count] = input.nextInt();
			if (scores[count] % 2 == 0){
				sumEvenNumbers = sumEvenNumbers + scores[count];
			}
		}
		System.out.printf("Sum of even indexes is: %d", sumEvenNumbers);
	}
}
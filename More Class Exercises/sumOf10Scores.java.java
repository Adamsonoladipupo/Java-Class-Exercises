import java.util.Scanner;

public class sumOf10Scores{
	public static void main(String[] args){
		int scores[] = new int[10];
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int count = 0; count < 10; count++){
			System.out.print("Enter number: ");
			scores[count] = input.nextInt();
			sum = sum + scores[count]; 
		}
		System.out.printf("Sum of all numbers: %d", sum); 
	}
}
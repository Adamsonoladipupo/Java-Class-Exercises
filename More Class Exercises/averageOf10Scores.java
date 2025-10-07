import java.util.Scanner;

public class averageOf10Scores{
	public static void main(String[] args){
		int scores[] = new int[10];
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int sampleSpace = 0;
		for (int count = 0; count < 10; count++){
			System.out.print("Enter number: ");
			scores[count] = input.nextInt();
			sum = sum + scores[count]; 
			sampleSpace++;
		}
		System.out.printf("Average of all numbers: %d", sum/sampleSpace); 
	}
}
import java.util.Scanner;

public class averageTenValidScoresSum{
	public static void main(String[] args){
		int scores[] = new int[10];
		int sumOfValid = 0;
		int sampleSpace = 0;
		Scanner input = new Scanner(System.in);
		for (int count = 0; count < 10; count++){
			System.out.print("Enter number: ");
			scores[count] = input.nextInt();
			if(scores[count] > 0 && scores[count] <= 100){
				sumOfValid = sumOfValid + scores[count];
				sampleSpace++;
			}
		}
		System.out.printf("Avearge of valid numbers is: %d", sumOfValid/sampleSpace);
	}
}
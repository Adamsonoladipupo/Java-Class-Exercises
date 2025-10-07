import java.util.Scanner;

public class sumAndAverageOfTask5{
	public static void main(String[] args){
		int scores[] = new int[10];
		Scanner input = new Scanner(System.in);
		int sumEvenIndexes = 0;
		int sampleSpace = 0;
		for (int count = 0; count < 10; count++){
			System.out.printf("Enter number for index %d: ", count);
			scores[count] = input.nextInt();
			if (count != 0 && count % 2 == 0){
				sumEvenIndexes = sumEvenIndexes + scores[count];
				sampleSpace++;
			}
		}
		System.out.printf("Sum and Average of even indexes are : %d %d", sumEvenIndexes,  sumEvenIndexes/sampleSpace);
	}
}
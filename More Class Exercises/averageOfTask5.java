import java.util.Scanner;

public class averageOfTask5{
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
		System.out.printf("Average of even indexes is: %d", sumEvenIndexes/sampleSpace);
	}
}
import java.util.Scanner;

public class findLargestNumberTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] number = new int[7];
		int largest = 0;
		int counter = 0;

		System.out.print("Enter number of indexes: ");
		counter = input.nextInt();

		System.out.print("Enter number for index 0 :");
		number[0] = input.nextInt();
		largest = number[0];

		for (int count = 1; count < counter; count++){
			System.out.printf("Enter number for index %d:", count);
			number[count] = input.nextInt();
			if (number[count] > largest){
				largest = number[count];
			}
		}
		System.out.print(largest);
	}
}
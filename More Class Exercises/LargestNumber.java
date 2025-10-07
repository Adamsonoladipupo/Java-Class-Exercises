import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first input: ");
		int num1 = input.nextInt();
		int largestNumber = 0;
		num1 = largestNumber;

		for (int count = 1; count <= 4; count++){
			System.out.print("Enter input: ");
			int num2 = input.nextInt();
			if (num2 > largestNumber){
				largestNumber = num2;
			}
		}
		System.out.printf("The largest number is: %d", largestNumber);
	}
}
import java.util.Scanner;

public class SmallestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		int Number = SmallestNumber(A, B, C);
		System.out.printf("Smallest number is: %d", Number);
	}
	
	// This is a function for findinf the samllest number
	public static int SmallestNumber(int Num1, int Num2, int Num3){
		int smallest = 0;

		if (Num1 < Num2 && Num1 < Num3){
			smallest = Num1;
		}
		 else if (Num2 < Num1 && Num2 < Num3 ){
			smallest = Num2;
		} else { smallest = Num3; }

		return smallest;
	}
}
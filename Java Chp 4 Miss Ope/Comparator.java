import java.util.Scanner;

public class Comparator{
	public static void main(String [] args){
		Scanner inputCollector = new Scanner(System.in);

		System.out.print("Enter your first number: ");
		int number1 = inputCollector.nextInt();
		System.out.print("Enter your first number: ");
		int number2 = inputCollector.nextInt();
		if (number1==number2){
			System.out.print("0");
		} else if (number1>number2){
			System.out.print("1");
		} else if (number1<number2){
			System.out.print("-1");
		}
		
	}
}
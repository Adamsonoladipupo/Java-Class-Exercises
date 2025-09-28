import java.util.Scanner;
public class Extremes{
	public static void main(String [] args){
		int number = 0 ;
		int largest = number;
		int smallest = number;
		Scanner inputCollector = new Scanner(System.in);

		System.out.print("How many numbers are you inputing: ");
		int counter = inputCollector.nextInt(); 
		int i = 0;
		for (i = 0; i < counter; i++){
			System.out.print("Enter a number: ");
			number = inputCollector.nextInt();
			if (number>largest){
				largest = number;
			}
			if (number<smallest && number > largest){
				smallest = number;
			}
		}
		System.out.printf("Number of itirations is: %d %n", i);
		System.out.printf("Largest number is: %d %n", largest);
		System.out.printf("smallest number is: %d %n", smallest);
		System.out.printf("sum of the two extremes is: %d", (largest + smallest));
		
	}
}

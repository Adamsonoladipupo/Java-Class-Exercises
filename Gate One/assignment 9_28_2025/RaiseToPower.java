import java.util.Scanner;

public class RaiseToPower{
	public static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int baseNumber = inputCollector.nextInt();
		System.out.print("Enter the power number: ");
		int powerNumber = inputCollector.nextInt();
		
		int counter = 0;
		long result = 1;
		for (counter = 1; counter <= powerNumber; counter++){
			result = result * baseNumber;
		}
		System.out.printf("%d raise to the power of %d is: %d", baseNumber,powerNumber,result );
	}
}
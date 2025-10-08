import java.util.Scanner;

public class morningCupCakesTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter indexes: ");
		int index = input.nextInt();

		System.out.print("Enter numbers: ");
		double uInput = input.nextInt();

		double rsult = morningCupCakes.isAverage(index, uInput);
		System.out.print(rsult);
		
 		

	}
}
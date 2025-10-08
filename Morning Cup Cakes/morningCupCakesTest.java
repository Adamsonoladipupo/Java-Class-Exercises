import java.util.Scanner;

public class morningCupCakesTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double[] integers = {2.0, 2, 2, 2.0, 2};
		double average = morningCupCakes.isAverage(integers);
		
		System.out.print(average);
 		

	}
}
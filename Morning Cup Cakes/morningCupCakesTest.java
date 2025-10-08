import java.util.Scanner;

public class morningCupCakesTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int[] integers = {2, 1, 3, 4, -1};
		int eTooSmall = morningCupCakes.isSmallest(integers);
		

		
		//double average = morningCupCakes.isAverage(integers);
		
		System.out.print(eTooSmall);
 		

	}
}
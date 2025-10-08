import java.util.Scanner;

public class morningCupCakesTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int number = input.nextInt();

		int[] integers = {1,2,3,4,5,22,11,45,80};
		boolean result = morningCupCakes.containsElement(number,integers);
		System.out.print(result);

		/*
		boolean check = false;
		for (int count = 1; count < integers.length; count++){
			//System.out.println(integers[count]);
			if (number == integers[count]){
				check = true;
			}else{check = false;}
		}
		System.out.print(check);

		
		*/

 		

	}
}
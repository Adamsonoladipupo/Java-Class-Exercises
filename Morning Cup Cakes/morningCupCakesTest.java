import java.util.Scanner;

public class morningCupCakesTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int[] integers = {2, 1, 3, 1, 4, 5, 7,1,1, 3, 9, 3,1};
		int smallest = morningCupCakes.countOccurence(integers);
		System.out.print(smallest);

		/*
		int occurence = 0;
		for (int count = 1; count < integers.length; count++){
			//System.out.println(integers[count]);
			if (integers[count] == integers[1]){
				occurence++;
			}
		}
		System.out.printf("%d occure %d times",integers[1], occurence );

		*/
		
		

 		

	}
}
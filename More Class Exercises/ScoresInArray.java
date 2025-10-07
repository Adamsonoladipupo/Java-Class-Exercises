import java.util.Scanner;

public class ScoresInArray{
	public static void main(String[] args){

		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for (int count = 0; count < 5; count++){
			System.out.printf("Enter number for index %d: ", count);
			scores[count] = input.nextInt();
		}
		System.out.println("Hurry! done collecting.");
		for  (int count = 0; count < 5; count++){
			System.out.print(scores[count]);	
		}
	}
}
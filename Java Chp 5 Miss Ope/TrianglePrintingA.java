import java.util.Scanner;

public class TrianglePrintingA{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the number of rows: ");
		//int r = input.nextInt();

		for (int r = 1; r <= 10; r++){
			for (int c = 1; c <= r; c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

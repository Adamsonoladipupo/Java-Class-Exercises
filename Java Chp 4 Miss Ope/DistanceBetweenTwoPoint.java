import java.util.Scanner;

public class DistanceBetweenTwoPoint{
	public static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter point X: ");
		double pointX = inputCollector.nextDouble();

		System.out.print("Enter point Y: ");
		double pointY = inputCollector.nextDouble();

		double squareRootDistance = pointX*pointX + pointY*pointY;
		double distance = Math.sqrt(squareRootDistance);
		
		System.out.printf("distance is: %f", squareRootDistance);

	}
}
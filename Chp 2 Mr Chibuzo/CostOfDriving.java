import java.util.Scanner;
public class CostOfDriving{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Welcome! This application helps you calculate the cost of driving");
System.out.print("Enter the driving distance: ");
Double DrivingDistance = input.nextDouble();
System.out.print("Enter miles per gallon: ");
Double MilesPerGallon = input.nextDouble();
System.out.print("Enter price per gallon: ");
Double PricePerGallon = input.nextDouble();
Double CostOfDriving = (DrivingDistance / MilesPerGallon) * PricePerGallon;
System.out.printf("The cost of travelling is: $ %.3f", CostOfDriving);

}
}
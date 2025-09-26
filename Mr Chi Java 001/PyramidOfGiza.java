import java.util.Scanner;

public class PyramidOfGiza {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

// Prompts and Inputs
System.out.println("Welcome, this application helps you estimate the time taken to build the Pyramid of Giza");
System.out.print("Enter the estimated number of stones:");
long NumberOfStones = input.nextLong();

System.out.print("Enter the average weight(tons) of each stone:");
float AveWeightOfStone = input.nextFloat();

System.out.print("Enter the number of years (365days) taken to build the Pyramid:");
long NumberOfYearsTaken = input.nextLong();

// Computations
float TotalWeight = NumberOfStones * AveWeightOfStone;
float TotalHours = NumberOfYearsTaken * 356 * 24;
float TotalMinutes = TotalHours * 60;

// Outputs
System.out.printf("The ammount of the pyramid weight built each year: %.0f%n", TotalWeight/NumberOfYearsTaken);
System.out.printf("The ammount of the pyramid weight built each hour: %.0f%n", TotalWeight/TotalHours);
System.out.printf("The ammount of the pyramid weight built each minute: %.0f%n", TotalWeight/TotalMinutes);

}
} 
import java.util.Scanner;

public class WorldPopulationGrowthCalculator{
public static void main (String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the world's population:");
long P0 = input.nextLong();

System.out.print("Enter the population growth rate:");
float r = input.nextFloat();

// Calculating the population of the next subsequent year using
/* P(t) = P0 x (1 + r)^t where:
P(t) is the population after t years, P0 is the current population, r is the growth rate (%), and t is the number of years
*/
// let (1 + r) bet rIn
float rPercent = r/100;
float rIn = rPercent + 1;
// System.out.println(rIn);

double P1 = P0 * rIn;
System.out.printf( "Estimated world population after ONE year is %.0f%n", P1);

double P2 = P0 * (rIn*rIn);
System.out.printf( "Estimated world population after TWO years is %.0f%n", P2);

double P3 = P0 * (rIn*rIn*rIn);
System.out.printf( "Estimated world population after THREE years is %.0f%n", P3);

double P4 = P0 * (rIn*rIn*rIn*rIn);
System.out.printf( "Estimated world population after FOUR years is %.0f%n", P4);
}
}
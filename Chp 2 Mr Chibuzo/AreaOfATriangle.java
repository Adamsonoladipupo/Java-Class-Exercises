import java.util.Scanner;

public class AreaOfATriangle{
public static void main (String[] args){
System.out.println("Welcome, this application helps you calculate the area of a triangle:");

// collect inputs from the user
Scanner input = new Scanner(System.in);
System.out.print("Enter x1:");
double x1 = input.nextDouble();
System.out.print("Enter y1:");
double y1 = input.nextDouble();
System.out.print("Enter x2:");
double x2 = input.nextDouble();
System.out.print("Enter y2:");
double y2 = input.nextDouble();
System.out.print("Enter x3:");
double x3 = input.nextDouble();
System.out.print("Enter y3:");
double y3 = input.nextDouble();

// computing side A

double SideAPoint1 = x2 - x1;
double SideAPoint1Square = SideAPoint1 * SideAPoint1;
double SideAPoint2 = y2 - y1;
double SideAPoint2Square = SideAPoint2 * SideAPoint2;
double SideAPoint1PlusPoint2 = SideAPoint1Square + SideAPoint2Square;
double SideA = Math.sqrt(SideAPoint1PlusPoint2);
System.out.printf("SideA: %f%n", SideAPoint1PlusPoint2);

// computing side B

double SideBPoint1 = x3 - x2;
double SideBPoint1Square = SideBPoint1 * SideBPoint1;
double SideBPoint2 = y3 - y3;
double SideBPoint2Square = SideBPoint2 * SideBPoint2;
double SideBPoint1PlusPoint2 = SideBPoint1Square + SideBPoint2Square;
double SideB = Math.sqrt(SideBPoint1PlusPoint2);
System.out.printf("SideB: %f%n", SideBPoint1PlusPoint2);

// computing side C

double SideCPoint1 = x3 - x1;
double SideCPoint1Square = SideCPoint1 * SideCPoint1;
double SideCPoint2 = y3 - y1;
double SideCPoint2Square = SideCPoint2 * SideCPoint2;
double SideCPoint1PlusPoint2 = SideCPoint1Square + SideCPoint2Square;
double SideC = Math.sqrt(SideCPoint1PlusPoint2);
System.out.printf("SideC: %f%n", SideCPoint1PlusPoint2);

// Computing for S and Area

double S = ( SideA + SideB + SideC )/2;
double Area = Math.sqrt(S * (S - SideA) * (S - SideB) * (S - SideC));
System.out.printf("The Area of the triangle is: %f%n", Area);







}
}
import java.util.Scanner;

public class Ex17Chp2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter three integers");
System.out.print("Enter first number: ");
int Num1 = input.nextInt();
System.out.print("Enter second number: ");
int Num2 = input.nextInt();
System.out.print("Enter third number: ");
int Num3 = input.nextInt();

int SmallestNumber = Num1;
int LargestNumber = Num1;

// computation
int SumOFNumbers = Num1 + Num2 + Num3;
int ProductOfNubers = Num1 * Num2 * Num3;
int AverageOfNumbers = SumOFNumbers/3;

System.out.printf("Sum of the numbers is: %d%n", SumOFNumbers);
System.out.printf("Product of the numbers is: %d%n", ProductOfNubers);
System.out.printf("Average of the numbers is: %d%n", AverageOfNumbers);

if (Num2 < SmallestNumber){
SmallestNumber = Num2;
}
if (Num3 < SmallestNumber){
SmallestNumber = Num3;
}
if (Num2 > LargestNumber){
LargestNumber = Num2;
}
if (Num3 > LargestNumber){
LargestNumber = Num3;
}
System.out.printf("The Largest Number is: %d%n", LargestNumber);
System.out.printf("The Smallest Number is: %d%n", SmallestNumber);
}
}
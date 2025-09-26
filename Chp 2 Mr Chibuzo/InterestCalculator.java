import java.util.Scanner;

public class InterestCalculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("This application helps you calculate your next month interest ");
System.out.print("Enter your balance:");
double Balance = input.nextDouble();
System.out.print("Enter your annual interest rate(e.g 3 for 3%):");
double AIR = input.nextDouble();
double Interest = Balance * (AIR/1200);
System.out.print("Your next month interest is " + Interest);
}
}
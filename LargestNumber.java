/*
Pseudo code
- display a welcome message highlighting what the app does
- ask the user to enter three set of numbers
- store the entered numbers in a variable
- declare another variable as largest and assign it to the first number of the set of numbers entered earlier
- re-assign the second number as the largest if it is greater that the first and the third number
- re-assign the third number as the largest if it is greater that the first and the second number
- print the largest number
*/
import java.util.Scanner;

public class LargestNumber{
public static void main(String[] args){
System.out.println("Welcome! This app helps you identify the largest number in a set of numbers");
System.out.println("Enter three numbers");
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = input.nextDouble();

System.out.print("Enter second number: ");
double num2 = input.nextDouble();

System.out.print("Enter third number: ");
double num3 = input.nextDouble();

// computation
double largest = num1;
if (num1 < num2 && num2 > num3){ largest = num2;}
else if (num1 < num3 && num3 > num2){ largest = num3;}

System.out.printf("The largest number is: %f", largest);

}
}

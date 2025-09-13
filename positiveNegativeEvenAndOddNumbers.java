/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter an input
- store the entered value in a variable
- check if the remainder of the entered is 0 when divided by 2, display "Even number"
- check if the remainder of the entered is not 0 when divided by 2, display "odd number"
*/

import java.util.Scanner;

public class positiveNegativeEvenAndOddNumbers{
public static void main (String[] args){
System.out.println("Welcome! This app helps you know your number");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();

// compuation
if (number % 2 == 0){System.out.printf("%d is a positive Even number", number);}
else if (number % 2 != 0){System.out.printf("%d is a positive Odd number", number);}

}
}

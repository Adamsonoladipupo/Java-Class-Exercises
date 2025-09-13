/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter an input
- store the entered value in a variable
- check if the remainder of the value entered when divided by 3 is zero and when devided by 5 is not zero , print "divisible by 3", if not
- check if the remainder of the value entered when divided by 5 is zero and when devided by 3 is not zero , print "divisible by 5", if not
- check if the remainder of the value entered when divided by 3 and 5 is zero , print "divisible by 3 and 5", if not
- print not divisible by 5 and 3.
*/

import java.util.Scanner;

public class DivisibleOrNotBy3And5{
public static void main(String[] args){
System.out.println("Welcome! This app let you know if a number is divisible or not by 3 and 5");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
double number = input.nextDouble();

//Computation
if (number % 3 == 0 && number % 5 != 0){System.out.printf("%.1f is divisible by 3", number);}
else if (number % 5 == 0 && number % 3 != 0){System.out.printf("%.1f is divisible by 5", number);}
else if (number % 3 == 0 && number % 5 == 0){System.out.printf("%.1f is divisible by 3 and 5", number);}
else if (number % 3 != 0 && number % 5 != 0){System.out.printf("%.1f is not divisible by 3 and 5", number);}



}
}
